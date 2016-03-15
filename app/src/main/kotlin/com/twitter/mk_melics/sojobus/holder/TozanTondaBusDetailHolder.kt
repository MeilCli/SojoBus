package com.twitter.mk_melics.sojobus.holder

import android.view.View
import java.util.*

class TozanTondaBusDetailHolder(itemView: View) : BaseBusDetailHolder(itemView) {
    override fun onBind() {
        Title.text="登山(JR富田駅)"
        SubTitle.text="JR富田駅発"
        var c = GregorianCalendar()
        c.set(Calendar.HOUR_OF_DAY,0)
        c.set(Calendar.MINUTE,0)
        show(Text,Manager.toKandaiFromTonda(-1,c))
    }
}