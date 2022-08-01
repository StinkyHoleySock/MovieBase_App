package com.dmitry.moviebaseapp.screens.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dmitry.moviebase_app.R
import com.dmitry.moviebase_app.databinding.FragmentFavoriteBinding

private var _binding: FragmentFavoriteBinding? = null
private val binding get() = _binding!!

class FavoriteFragment: Fragment(R.layout.fragment_favorite) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}