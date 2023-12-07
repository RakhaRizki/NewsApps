package com.rakha.example.finalnewsapp.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rakha.example.finalnewsapp.ui.detail.Cnn.CnnEntertaimentFragment
import com.rakha.example.finalnewsapp.ui.detail.Cnn.CnnEcoFragment
import com.rakha.example.finalnewsapp.ui.detail.Cnn.CnnTechFragment
import com.rakha.example.finalnewsapp.ui.home.CnnNewsFragment

class CnnNewsAdapter(fa: CnnNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CnnEntertaimentFragment()
            1 -> CnnEcoFragment()
            2 -> CnnTechFragment()
            else -> CnnEntertaimentFragment()
        }
    }

}