package com.saiful.pageview2tabbed.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.saiful.pageview2tabbed.fragment.AFragment
import com.saiful.pageview2tabbed.fragment.BFragment
import com.saiful.pageview2tabbed.model.Tab

class TabAdapter(manager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(manager, lifecycle) {

    companion object {
        val tabList = listOf(
        Tab(AFragment(), "A Frag"),
        Tab(BFragment(), "B Frag")
        )
    }

    //model concept class
    override fun getItemCount(): Int {
        return tabList.size
    }

    override fun createFragment(position: Int): Fragment {
//        dice roller app polish
//        when (position) {
//            0 -> return AFragment()
//            1 -> return BFragment()
//        }
        return tabList[position].fragment
    }
}