package com.twitter.info_melics.skinfo.bus

/*
2002wt -> 20:02 平日 高槻行き
平日:w
土曜:d
日曜:n
高槻行き:t
富田行き:s
関西大学行き:r
萩谷行き;h
萩谷総合公園行き:k
学期運行:g
学休運行:y
直行:e
富田経由:v
 */
class Bus(time: String) {
    var IsWeekDay: Boolean
    var IsSuturday: Boolean
    var IsSunday: Boolean
    var Type: Int
    var Time: Int

    init {
        Time = 0
        IsWeekDay = false
        IsSuturday = false
        IsSunday = false
        Type = 0
        if (time.length() >= 6) {
            Time = time.substring(range = 0..3).toInt()
            var c: Char
            for (i in 4..time.lastIndex) {
                c = time.charAt(i)
                when (c) {
                    'w' -> IsWeekDay = true
                    'd' -> IsSuturday = true
                    'n' -> IsSunday = true
                    't' -> Type = Type or BusType.ToTakatuki.type
                    's' -> Type = Type or BusType.ToTonda.type
                    'r' -> Type = Type or BusType.ToRapyuta.type
                    'h' -> Type = Type or BusType.ToHagitani.type
                    'k' -> Type = Type or BusType.ToHagitaniKouen.type
                    'g' -> Type = Type or BusType.IsGakki.type
                    'y' -> Type = Type or BusType.IsYasumi.type
                    'e' -> Type = Type or BusType.IsTyokkou.type
                    'v' -> Type = Type or BusType.ViaTonda.type
                }
            }
        }
    }

    fun target():String{
        when{
            BusType.ToRapyuta.hasFlag(Type) -> return "関西大学行き"
            BusType.ToHagitani.hasFlag(Type) -> return "萩谷行き"
            BusType.ToHagitaniKouen.hasFlag(Type) -> return "萩谷総合公園行き"
            BusType.ToTakatuki.hasFlag(Type)-> return "JR高槻駅北行き"
            BusType.ToTonda.hasFlag(Type)->return "JR富田駅行き"
        }
        return ""
    }

    fun via():String{
        if(BusType.ViaTonda.hasFlag(Type)){
            return "JR富田駅経由"
        }
        return "";
    }

    fun express():String{
        if(BusType.IsTyokkou.hasFlag(Type)){
            return "直行"
        }
        return ""
    }

    override fun toString(): String {
        return via()+target()+express()
    }
}