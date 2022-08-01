package com.dmitry.moviebaseapp.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.dmitry.moviebase_app.R
import com.dmitry.moviebase_app.databinding.FragmentMainBinding

private  var _binding: FragmentMainBinding? = null
private val binding get() = _binding!!

class MainFragment: Fragment(R.layout.fragment_main) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomNavigationView = binding.bottomNavMenu
        val navController = (childFragmentManager.findFragmentById(R.id.main_container) as NavHostFragment).navController

        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}