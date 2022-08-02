package com.dmitry.moviebase_app.screens.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dmitry.moviebase_app.data.api.TestRepo
import com.dmitry.moviebase_app.model.SearchResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: TestRepo): ViewModel() {

    private val _all = MutableLiveData<SearchResponse>()
    val all: LiveData<SearchResponse> get() = _all

    init {
        getAll()
    }

    fun getAll() = viewModelScope.launch {
        repository.getSearch().let {
            if (it.isSuccessful) {
                _all.postValue(it.body())
            } else {
                Log.d("checkData", "Failed to load search: ${it.errorBody()}")
            }
        }
    }
}