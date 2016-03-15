package com.twitter.info_melics.skinfo.bus

enum class BusType(val type : Int) {
    ToTakatuki(1),
    ToTonda(2),
    ToRapyuta(4),
    ToHagitani(8),
    ToHagitaniKouen(16),
    IsGakki(32),
    IsYasumi(64),
    IsTyokkou(128),
    ViaTonda(256);

    fun hasFlag(bus :BusType) : Boolean{
        return (type and bus.type) == type
    }

    fun hasFlag(bus :Int) : Boolean{
        return (type and bus) == type
    }

}