package com.twitter.mk_melics.sojobus.holder

import android.view.View

class GezanBusSimpleHolder(itemView: View) : BaseBusSimpleHolder(itemView) {
    override fun onBind() {
        Title.text = "下山"
        Item1Title.text="関西大学発"
        show(Item1Text,Manager.toTakatukiFromRapyuta(3))
        Item2Title.text="関西大学発"
        show(Item2Text,Manager.toTondaFromRapyuta(3))
    }
}