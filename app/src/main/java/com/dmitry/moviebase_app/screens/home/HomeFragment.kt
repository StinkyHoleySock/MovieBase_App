package com.dmitry.moviebase_app.screens.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dmitry.moviebase_app.R
import com.dmitry.moviebase_app.databinding.FragmentHomeBinding

private var _binding: FragmentHomeBinding? = null
private val binding get() = _binding!!

class HomeFragment: Fragment(R.layout.fragment_home) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}