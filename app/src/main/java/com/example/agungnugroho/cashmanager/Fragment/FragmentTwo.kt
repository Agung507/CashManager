package com.example.agungnugroho.cashmanager.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agungnugroho.cashmanager.R

class FragmentTwo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater!!.inflate(R.layout.fragment_two, container, false)

    companion object {
        fun newInstance(): FragmentTwo = FragmentTwo()
    }
}