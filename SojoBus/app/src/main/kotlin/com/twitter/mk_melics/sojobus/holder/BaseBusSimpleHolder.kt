package com.twitter.mk_melics.sojobus.holder

import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.twitter.info_melics.skinfo.bus.Bus
import com.twitter.info_melics.skinfo.bus.BusManager
import com.twitter.mk_melics.sojobus.R
import com.twitter.mk_melics.sojobus.adapter.BusAdapter

abstract class BaseBusSimpleHolder(itemView: View) : RecyclerView.ViewHolder(itemView), BusAdapter.OnBindListener {
    protected val Title : AppCompatTextView
    protected val Item1Title: AppCompatTextView
    protected val Item1Text: AppCompatTextView
    protected val Item2Title : AppCompatTextView
    protected val Item2Text: AppCompatTextView
    protected val Manager : BusManager

    init {
        Title = itemView.findViewById(R.id.title) as AppCompatTextView
        Item1Title = itemView.findViewById(R.id.item1_title) as AppCompatTextView
        Item1Text = itemView.findViewById(R.id.item1_text) as AppCompatTextView
        Item2Title = itemView.findViewById(R.id.item2_title) as AppCompatTextView
        Item2Text = itemView.findViewById(R.id.item2_text) as AppCompatTextView
        Manager = BusManager()
    }

    fun show(text : TextView,list :List<Bus>){
        if(list.size()==0){
            text.text = "最終バスが終わりました"
            return
        }
        var s : String = ""
        var bus : Bus
        for(i in 0..list.lastIndex){
            bus = list[i]
            s += (bus.Time/100).toString()
            s += ":"
            s += if(bus.Time%100<10) "0" else ""
            s += (bus.Time%100).toString()
            s += "\n"
            s += bus.toString()
            s += "\n"
            s += if(i==list.lastIndex) "" else "↓\n"
        }
        text.text=s;
    }
}