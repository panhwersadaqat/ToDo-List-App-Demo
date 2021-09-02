package com.example.todoappdemo.presentation.addTaskActivity.activity

import androidx.activity.viewModels
import com.example.todoappdemo.R
import com.example.todoappdemo.common.base.activity.AppBaseActivity
import com.example.todoappdemo.databinding.ActivityAddTaskBinding
import com.example.todoappdemo.databinding.ActivityMainBinding
import com.example.todoappdemo.presentation.addTaskActivity.viewModel.AddTaskViewModel
import com.example.todoappdemo.presentation.mainActivity.viewModel.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel

@AndroidEntryPoint
class AddTaskActivity : AppBaseActivity<ActivityAddTaskBinding>() {
    private val viewModel: AddTaskViewModel by viewModels()
    override fun init() {

    }

    override fun setEvents() {
    }

    override fun setObservers() {

    }

    override fun getLayoutResId() = R.layout.activity_add_task
    override fun dataBinding(dataBinder: ActivityAddTaskBinding) {

    }
}