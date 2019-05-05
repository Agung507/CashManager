package com.example.agungnugroho.cashmanager.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.agungnugroho.cashmanager.Fragment.FragmentOne
import com.example.agungnugroho.cashmanager.Fragment.FragmentThree
import com.example.agungnugroho.cashmanager.Fragment.FragmentTwo

class SampleAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? = when (position) {
        0 -> FragmentOne.newInstance()
        1 -> FragmentTwo.newInstance()
        2 -> FragmentThree.newInstance()
        else -> null
    }

    override fun getPageTitle(position: Int): CharSequence = when (position) {
        0 -> "Pengeluaran"
        1 -> "Anggaran"
        2 -> "Grafik"
        else -> ""
    }

    override fun getCount(): Int = 3
}