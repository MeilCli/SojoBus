package com.twitter.mk_melics.sojobus

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem

import com.twitter.mk_melics.sojobus.fragment.LicenseDialogFragment
import com.twitter.mk_melics.sojobus.presenter.MainActivityRecyclerViewPresenter

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var recyclerViewPresenter: MainActivityRecyclerViewPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

        recyclerViewPresenter = MainActivityRecyclerViewPresenter(this)
    }

    override fun onResume() {
        super.onResume()
        recyclerViewPresenter!!.onResume()
    }

    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (recyclerViewPresenter!!.haveNavigationItem().contains(id)) {
            recyclerViewPresenter!!.onNavigationItemSelected(item)
        }
        if (id == R.id.nav_license) {
            val fragment = LicenseDialogFragment()
            fragment.show(supportFragmentManager, LicenseDialogFragment::class.java.simpleName)
        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
