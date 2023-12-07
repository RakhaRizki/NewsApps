package com.rakha.example.finalnewsapp.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rakha.example.finalnewsapp.ui.detail.Okezone.OkezoneAutoFragment
import com.rakha.example.finalnewsapp.ui.detail.Okezone.OkezoneEcoFragment
import com.rakha.example.finalnewsapp.ui.detail.Okezone.OkezoneTechFragment
import com.rakha.example.finalnewsapp.ui.home.OkezoneNewsFragment

class OkezoneNewsAdapter (fa: OkezoneNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> OkezoneAutoFragment()
            1 -> OkezoneEcoFragment()
            2 -> OkezoneTechFragment()
            else -> OkezoneAutoFragment()
        }
    }

}