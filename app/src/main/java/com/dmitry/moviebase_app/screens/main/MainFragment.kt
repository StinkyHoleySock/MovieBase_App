package com.dmitry.moviebaseapp.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.dmitry.moviebase_app.R
import com.dmitry.moviebase_app.databinding.FragmentMainBinding
import com.dmitry.moviebase_app.screens.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

private  var _binding: FragmentMainBinding? = null
private val binding get() = _binding!!


@AndroidEntryPoint
class MainFragment: Fragment(R.layout.fragment_main) {

    private val viewModel by viewModels<MainViewModel>()

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

        viewModel.all
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}