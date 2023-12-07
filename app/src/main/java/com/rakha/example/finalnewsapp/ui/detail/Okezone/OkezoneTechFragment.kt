package com.rakha.example.finalnewsapp.ui.detail.Okezone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.rakha.example.finalnewsapp.adapter.NewsAdapter
import com.rakha.example.finalnewsapp.data.repository.NewsRepository
import com.rakha.example.finalnewsapp.databinding.FragmentOkezoneTechBinding
import com.rakha.example.finalnewsapp.ui.NewsViewModel
import com.rakha.example.finalnewsapp.utils.NewsViewModelFactory

class OkezoneTechFragment : Fragment() {
    private lateinit var binding: FragmentOkezoneTechBinding
    private val commonViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOkezoneTechBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        commonViewModel.getOkezoneTechNews()
        commonViewModel.OkezoneTechNews.observe(viewLifecycleOwner) { newsResponse ->
            val articles = newsResponse.data?.posts
            articles?.let {
                mAdapter.setData(it.filterNotNull())
                binding.rvNews.apply {
                    adapter = mAdapter
                    layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
    }
}