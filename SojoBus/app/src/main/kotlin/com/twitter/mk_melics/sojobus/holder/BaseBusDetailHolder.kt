package com.twitter.mk_melics.sojobus.holder

import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.twitter.info_melics.skinfo.bus.Bus
import com.twitter.info_melics.skinfo.bus.BusManager
import com.twitter.mk_melics.sojobus.R
import com.twitter.mk_melics.sojobus.adapter.BusAdapter

abstract class BaseBusDetailHolder(itemView: View) : RecyclerView.ViewHolder(itemView), BusAdapter.OnBindListener {
    protected val Title: AppCompatTextView
    protected val SubTitle :AppCompatTextView
    protected val Text: AppCompatTextView
    protected val Manager: BusManager

    init {
        Title = itemView.findViewById(R.id.title) as AppCompatTextView
        SubTitle=itemView.findViewById(R.id.sub_title)as AppCompatTextView
        Text = itemView.findViewById(R.id.text) as AppCompatTextView
        Manager = BusManager()
    }

    fun show(text: TextView, list: List<Bus>) {
        var sb = StringBuilder()
        var bus: Bus
        var index = 0
        for (i in 6..23) {
            sb.append(i)
            sb.append("時:")
            while (index < list.size()) {
                bus = list[index]
                if (bus.Time / 100 != i) {
                    break;
                }
                sb.append(' ')
                sb.append(bus.Time%100)
                index++
            }
            sb.append('\n')
        }
        text.text=sb.toString()
    }
}