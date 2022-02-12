package com.example.corona.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.corona.fragment.HomeFragment
import com.example.corona.fragment.InformationFragment
import com.example.corona.fragment.ProtecttionFragment

class viewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                ProtecttionFragment()
            }
            2 -> {
                InformationFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}