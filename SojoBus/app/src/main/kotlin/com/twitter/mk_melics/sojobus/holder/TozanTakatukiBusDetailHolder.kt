package com.twitter.mk_melics.sojobus.holder

import android.view.View
import java.util.*

class TozanTakatukiBusDetailHolder(itemView: View) : BaseBusDetailHolder(itemView) {
    override fun onBind() {
        Title.text="登山(JR高槻駅北)"
        SubTitle.text="JR高槻駅北発"
        var c = GregorianCalendar()
        c.set(Calendar.HOUR_OF_DAY,0)
        c.set(Calendar.MINUTE,0)
        show(Text,Manager.toKandaiFromTakatuki(-1,c))
    }
}