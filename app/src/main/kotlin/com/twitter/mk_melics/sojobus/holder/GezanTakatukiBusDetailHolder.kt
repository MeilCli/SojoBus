package com.twitter.mk_melics.sojobus.holder

import android.view.View
import java.util.*

class GezanTakatukiBusDetailHolder(itemView: View) : BaseBusDetailHolder(itemView) {
    override fun onBind() {
        Title.text="下山(JR高槻駅北)"
        SubTitle.text="関西大学発"
        var c = GregorianCalendar()
        c.set(Calendar.HOUR_OF_DAY,0)
        c.set(Calendar.MINUTE,0)
        show(Text,Manager.toTakatukiFromRapyuta(-1,c))
    }
}