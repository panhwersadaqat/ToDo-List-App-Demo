package com.example.todoappdemo.presentation.addTaskActivity.activity

import androidx.activity.viewModels
import com.example.todoappdemo.R
import com.example.todoappdemo.common.base.activity.AppBaseActivity
import com.example.todoappdemo.databinding.ActivityAddTaskBinding
import com.example.todoappdemo.databinding.ActivityMainBinding
import com.example.todoappdemo.presentation.addTaskActivity.viewModel.AddTaskViewModel


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

    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }
}