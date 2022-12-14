package com.dmitry.moviebaseapp.screens.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dmitry.moviebase_app.R
import com.dmitry.moviebase_app.databinding.FragmentSearchBinding

private var _binding: FragmentSearchBinding? = null
private val binding get() = _binding!!

class SearchFragment: Fragment(R.layout.fragment_search) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}