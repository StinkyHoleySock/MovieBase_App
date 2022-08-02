package com.dmitry.moviebase_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dmitry.moviebase_app.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

private var _binding: ActivityMainBinding? = null
private val binding get() = _binding!!

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}