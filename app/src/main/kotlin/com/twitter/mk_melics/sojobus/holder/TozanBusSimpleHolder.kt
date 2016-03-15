package com.twitter.mk_melics.sojobus.holder

import android.view.View

class TozanBusSimpleHolder(itemView: View) : BaseBusSimpleHolder(itemView) {
    override fun onBind() {
        Title.text = "登山"
        Item1Title.text="JR高槻駅北発"
        show(Item1Text,Manager.toKandaiFromTakatuki(3))
        Item2Title.text="JR富田駅発"
        show(Item2Text,Manager.toKandaiFromTonda(3))
    }
}