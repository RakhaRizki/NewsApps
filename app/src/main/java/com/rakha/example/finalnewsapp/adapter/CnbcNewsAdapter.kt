package com.rakha.example.finalnewsapp.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rakha.example.finalnewsapp.ui.detail.Cnbc.CnbcEntreuFragment
import com.rakha.example.finalnewsapp.ui.detail.Cnbc.CnbcLifeFragment
import com.rakha.example.finalnewsapp.ui.detail.Cnbc.CnbcTechFragment
import com.rakha.example.finalnewsapp.ui.home.CnbcNewsFragment

class CnbcNewsAdapter (fa: CnbcNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CnbcEntreuFragment()
            1 -> CnbcLifeFragment()
            2 -> CnbcTechFragment()
            else -> CnbcEntreuFragment()
        }
    }

}