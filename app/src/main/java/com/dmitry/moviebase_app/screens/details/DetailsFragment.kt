package com.dmitry.moviebaseapp.screens.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dmitry.moviebase_app.R
import com.dmitry.moviebase_app.databinding.FragmentDetailsBinding

private var _binding: FragmentDetailsBinding? = null
private val binding get() = _binding!!

class DetailsFragment: Fragment(R.layout.fragment_details) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

