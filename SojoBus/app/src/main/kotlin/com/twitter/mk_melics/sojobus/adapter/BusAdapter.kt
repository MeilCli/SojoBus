package com.twitter.mk_melics.sojobus.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.twitter.mk_melics.sojobus.R
import com.twitter.mk_melics.sojobus.holder.*
import java.util.*

class BusAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    interface OnBindListener {
        fun onBind()
    }

    private val list = ArrayList<Int>()

    init{
        list.add(R.id.nav_tozan)
        list.add(R.id.nav_gezan)
        list.add(R.id.nav_tozan_takatuki)
        list.add(R.id.nav_gezan_takatuki)
        list.add(R.id.nav_tozan_tonda)
        list.add(R.id.nav_gezan_tonda)
    }

    fun getList():ArrayList<Int>{
        return list
    }

    override fun getItemCount(): Int {
        return list.size()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder? {
        val layout = when(list[viewType]){
            R.id.nav_tozan->R.layout.holder_bus_simple
            R.id.nav_gezan->R.layout.holder_bus_simple
            R.id.nav_tozan_takatuki->R.layout.holder_bus_detail
            R.id.nav_gezan_takatuki->R.layout.holder_bus_detail
            R.id.nav_tozan_tonda->R.layout.holder_bus_detail
            R.id.nav_gezan_tonda->R.layout.holder_bus_detail
            else->0
        }
        val view = View.inflate(parent?.context,layout,null)
        var holder : RecyclerView.ViewHolder? = when(list[viewType]){
            R.id.nav_tozan -> TozanBusSimpleHolder(view)
            R.id.nav_gezan -> GezanBusSimpleHolder(view)
            R.id.nav_tozan_takatuki->TozanTakatukiBusDetailHolder(view)
            R.id.nav_gezan_takatuki->GezanTakatukiBusDetailHolder(view)
            R.id.nav_tozan_tonda->TozanTondaBusDetailHolder(view)
            R.id.nav_gezan_tonda->GezanTondaBusDetailHolder(view)
            else -> null
        }
        holder?.setIsRecyclable(false)
        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is OnBindListener){
            holder.onBind()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}