package com.example.todoappdemo.common.base.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

/**
 * Created by Sadaqat Panhwer | https://panhwersadaqat.github.io/
 * on 9/2/2021
 */
open class BaseViewModel : ViewModel() {
    val isLoading = MutableLiveData<Boolean>()
    val showMessage = MutableLiveData<String>()

    private val job = Job()
    val coroutineScope = CoroutineScope(Dispatchers.Main + job)
    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}