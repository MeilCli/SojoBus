package com.twitter.mk_melics.sojobus.holder

import android.view.View
import java.util.*

class GezanTondaBusDetailHolder(itemView: View) : BaseBusDetailHolder(itemView) {
    override fun onBind() {
        Title.text="下山(JR富田駅)"
        SubTitle.text="関西大学発"
        var c = GregorianCalendar()
        c.set(Calendar.HOUR_OF_DAY,0)
        c.set(Calendar.MINUTE,0)
        show(Text,Manager.toTondaFromRapyuta(-1,c))
    }
}