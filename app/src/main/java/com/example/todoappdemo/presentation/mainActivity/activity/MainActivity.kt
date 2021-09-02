package com.example.todoappdemo.presentation.mainActivity.activity


import android.content.Intent
import androidx.activity.viewModels
import com.example.todoappdemo.R
import com.example.todoappdemo.common.base.activity.AppBaseActivity
import com.example.todoappdemo.databinding.ActivityMainBinding
import com.example.todoappdemo.presentation.addTaskActivity.activity.AddTaskActivity
import com.example.todoappdemo.presentation.mainActivity.viewModel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppBaseActivity<ActivityMainBinding>() {
    private val viewModel: MainActivityViewModel by viewModels()
    override fun init() {

    }

    override fun setEvents() {
        add_task_btn.setOnClickListener {
            //startAnotherActivity(this,AddTaskActivity)
            val intent = Intent(this, AddTaskActivity::class.java)
            startAnotherActivity(intent)
        }
    }

    override fun setObservers() {

    }

    override fun getLayoutResId() = R.layout.activity_main
    override fun dataBinding(dataBinder: ActivityMainBinding) {

    }
}