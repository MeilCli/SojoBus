package com.twitter.mk_melics.sojobus.presenter

import android.support.design.widget.NavigationView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MenuItem
import com.twitter.mk_melics.sojobus.MainActivity
import com.twitter.mk_melics.sojobus.R
import com.twitter.mk_melics.sojobus.adapter.BusAdapter

class MainActivityRecyclerViewPresenter(activity: MainActivity) : RecyclerView.OnScrollListener() {

    private val navigationView : NavigationView
    private val recyclerView : RecyclerView
    private val linearLayoutManager:LinearLayoutManager
    private val busAdapter : BusAdapter
    private var firstVisibleIndex:Int=0

    init{
        navigationView = activity.findViewById(R.id.nav_view) as NavigationView
        recyclerView = activity.findViewById(R.id.recyclerview) as RecyclerView
        linearLayoutManager = LinearLayoutManager(activity.getBaseContext())
        busAdapter = BusAdapter()

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter =busAdapter
        recyclerView.addOnScrollListener(this)

        navigationView.setCheckedItem(busAdapter.getList()[0])
    }

    override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        var firstVisibleIndex=linearLayoutManager.findFirstVisibleItemPosition()
        if(this.firstVisibleIndex!=firstVisibleIndex){
            this.firstVisibleIndex=firstVisibleIndex
            navigationView.setCheckedItem(busAdapter.getList()[this.firstVisibleIndex])
        }
    }

    fun onResume():Unit{
        busAdapter.notifyDataSetChanged()
    }

    fun haveNavigationItem():List<Int>{
        return busAdapter.getList()
    }

    fun onNavigationItemSelected(item : MenuItem):Unit{
        var index = busAdapter.getList().indexOf(item.itemId)
        if(index!=-1){
            linearLayoutManager.scrollToPosition(index)
            this.firstVisibleIndex=firstVisibleIndex
        }
    }
}