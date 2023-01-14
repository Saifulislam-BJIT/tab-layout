package com.saiful.pageview2tabbed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.saiful.pageview2tabbed.adapter.TabAdapter
import com.saiful.pageview2tabbed.adapter.TabAdapter.Companion.tabList


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabLayout: TabLayout = view.findViewById(R.id.tab_layout_home)
        val viewPager: ViewPager2 = view.findViewById(R.id.view_pager2)

        val tabAdapter = TabAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = tabAdapter
        TabLayoutMediator(tabLayout, viewPager) {
            tab, position -> tab.text = tabList[position].title
        }.attach()
    }

}