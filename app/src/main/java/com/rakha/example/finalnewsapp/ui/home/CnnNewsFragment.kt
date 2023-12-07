package com.rakha.example.finalnewsapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.rakha.example.finalnewsapp.R
import com.rakha.example.finalnewsapp.adapter.CnnNewsAdapter
import com.rakha.example.finalnewsapp.databinding.FragmentCnnNewsBinding

class CnnNewsFragment : Fragment() {

    lateinit var binding: FragmentCnnNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnnNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding.vpNews.adapter = CnnNewsAdapter(this)

        val tabsList = arrayOf(
            "Hiburan",
            "Ekonomi",
            "Teknologi"
        )
        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
            tab.text = tabsList[page]
        }.attach()
    }
}