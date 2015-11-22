package com.twitter.info_melics.skinfo.bus

import java.util.*

class BusManager {

    fun toKandaiFromTakatuki(take:Int =3,c:Calendar = GregorianCalendar()): List<Bus> {
        var isSaturday: Boolean = isSaturday(c)
        var isSunday: Boolean = isSunday(c)
        var time: Int = getTime(c)
        var isGakki: Boolean = isGakki(c)
        //遅延評価しないっぽいので書き換えの必要がある
        var list: List<Bus> = BusData.TakatukiKita
                .filter { x -> if (isSunday == true) x.IsSunday else if (isSaturday == true) x.IsSuturday else x.IsWeekDay }
                .filter { x -> x.Time >= time }
                .filter { x -> BusType.ToRapyuta.hasFlag(x.Type) }
                .filter { x -> if (BusType.IsGakki.hasFlag(x.Type) && isGakki == false) false else true }
                .filter { x -> if ( BusType.IsYasumi.hasFlag(x.Type) && isGakki == true) false else true }
        list = if(take==-1) list else list.take(take)
        return list
    }

    fun toKandaiFromTonda(take:Int =3,c:Calendar = GregorianCalendar()): List<Bus> {
        var isSaturday: Boolean = isSaturday(c)
        var isSunday: Boolean = isSunday(c)
        var time: Int = getTime(c)
        var isGakki: Boolean = isGakki(c)
        //遅延評価しないっぽいので書き換えの必要がある
        var list: List<Bus> = BusData.Tonda
                .filter { x -> if (isSunday == true) x.IsSunday else if (isSaturday == true) x.IsSuturday else x.IsWeekDay }
                .filter { x -> x.Time >= time }
                .filter { x -> BusType.ToRapyuta.hasFlag(x.Type)
                        || BusType.ToHagitani.hasFlag(x.Type)
                        || BusType.ToHagitaniKouen.hasFlag(x.Type) }
                .filter { x -> if (BusType.IsGakki.hasFlag(x.Type) && isGakki == false) false else true }
                .filter { x -> if (BusType.IsYasumi.hasFlag(x.Type) && isGakki == true) false else true }
        list = if(take==-1) list else list.take(take)
        return list
    }

    fun toTakatukiFromRapyuta(take:Int =3,c:Calendar = GregorianCalendar()): List<Bus> {
        var isSaturday: Boolean = isSaturday(c)
        var isSunday: Boolean = isSunday(c)
        var time: Int = getTime(c)
        var isGakki: Boolean = isGakki(c)
        //遅延評価しないっぽいので書き換えの必要がある
        var list: List<Bus> = BusData.KansaiDaigaku
                .filter { x -> if (isSunday == true) x.IsSunday else if (isSaturday == true) x.IsSuturday else x.IsWeekDay }
                .filter { x -> x.Time >= time }
                .filter { x -> BusType.ToTakatuki.hasFlag(x.Type) && BusType.ViaTonda.hasFlag(x.Type) == false }
                .filter { x -> if (BusType.IsGakki.hasFlag(x.Type) && isGakki == false) false else true }
                .filter { x -> if (BusType.IsYasumi.hasFlag(x.Type) && isGakki == true) false else true }
        list = if(take==-1) list else list.take(take)
        return list
    }

    fun toTondaFromRapyuta(take:Int =3,c:Calendar = GregorianCalendar()): List<Bus> {
        var isSaturday: Boolean = isSaturday(c)
        var isSunday: Boolean = isSunday(c)
        var time: Int = getTime(c)
        var isGakki: Boolean = isGakki(c)
        //遅延評価しないっぽいので書き換えの必要がある
        var list: List<Bus> = BusData.KansaiDaigaku
                .filter { x -> if (isSunday == true) x.IsSunday else if (isSaturday == true) x.IsSuturday else x.IsWeekDay }
                .filter { x -> x.Time >= time }
                .filter { x -> BusType.ToTonda.hasFlag(x.Type) || BusType.ViaTonda.hasFlag(x.Type) }
                .filter { x -> if (BusType.IsGakki.hasFlag(x.Type) && isGakki == false) false else true }
                .filter { x -> if (BusType.IsYasumi.hasFlag(x.Type) && isGakki == true) false else true }
        list = if(take==-1) list else list.take(take)
        return list
    }

    fun getTime(c:Calendar): Int {
        var time: Int = c.get(Calendar.HOUR_OF_DAY) * 100
        time = time + c.get(Calendar.MINUTE)
        return time
    }

    //2015年度
    fun isGakki(c:Calendar): Boolean {
        var day: Int = c.get(Calendar.DAY_OF_MONTH)
        var month: Int = c.get(Calendar.MONTH)+1//最初の月は0
        var time: Int = month * 100 + day
        if (time in 801..923) return false
        if (time in 1225..1231) return false
        if (time in 101..106) return false
        if (time in 130..331) return false
        return true
    }

    fun isSaturday(c:Calendar): Boolean {
        return c.get(Calendar.DAY_OF_WEEK) == 7
    }

    fun isSunday(c:Calendar): Boolean {
        if (c.get(Calendar.DAY_OF_WEEK) == 1||isHoliday(c)) {
            return true
        } else {
            //日曜~~前日が祝日かどうか
            var c2 = GregorianCalendar()
            c2.set(c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH))
            var c3 = GregorianCalendar()
            c3.set(c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)+1)
            for (i in 2..c.get(Calendar.DAY_OF_WEEK)) {
                c2.add(Calendar.DAY_OF_YEAR, -1)
                //国民の祝日に関する法律第３条第３項
                if(i==2&&isHoliday(c2)&&isHoliday(c3)){//前日後日が祝日なら祝日
                    return true
                }
                if (isHoliday(c2) == false) {
                    return false
                }
            }
            return true
        }
    }

    //手抜き
    fun isHoliday(c: Calendar): Boolean {
        var year: Int = c.get(Calendar.YEAR)
        var day: Int = c.get(Calendar.DAY_OF_MONTH)
        var week: Int = c.get(Calendar.DAY_OF_WEEK_IN_MONTH)
        var y: Int = c.get(Calendar.DAY_OF_WEEK)
        when (c.get(Calendar.MONTH)) {
            //最初の月は0
            0 -> {
                if (day in 1..3) return true
                if (week == 2 && y == 2) return true
            }
            1 -> {
                if (day == 11) return true
            }
            2 -> {
                if (year in 1992..2023) {
                    if (year % 4 in 0..1) return day == 20
                    else return day == 21
                } else {
                    //2055年まで
                    if (year % 4 in 0..2) return day == 20
                    else return day == 21
                }
            }
            3 -> {
                if (day == 29) return true
            }
            4 -> {
                if (day in 3..5) return true
            }
            6 -> {
                if (week == 3 && y == 2) return true
            }
            7 -> {
                if (day == 11) return true
            }
            8 -> {
                if (week == 3 && y == 2) return true
                if (year % 4 in 1..3) return day == 23//2043年まで
                else return day == 22
            }
            9 -> {
                if (week == 2 && y == 2) return true
            }
            10 -> {
                if (day == 3) return true
                if (day == 23) return true
            }
            11 -> {
                if (day == 23) return true
                if (day in 29..31) return true
            }
        }
        return false
    }

}