package com.example.todoappdemo.presentation.activity


import androidx.activity.viewModels
import com.example.todoappdemo.R
import com.example.todoappdemo.common.base.activity.AppBaseActivity
import com.example.todoappdemo.databinding.ActivityMainBinding
import com.example.todoappdemo.presentation.viewModel.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppBaseActivity<ActivityMainBinding>() {
    private val viewModel: MainActivityViewModel by viewModels()
    override fun init() {

    }

    override fun setEvents() {
    }

    override fun setObservers() {

    }

    override fun getLayoutResId() = R.layout.activity_main
    override fun dataBinding(dataBinder: ActivityMainBinding) {

    }
}