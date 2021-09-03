package com.example.todoappdemo.presentation.mainActivity.activity

import android.app.Activity
import android.content.Intent
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoappdemo.R
import androidx.lifecycle.observe

import com.example.todoappdemo.common.base.activity.AppBaseActivity
import com.example.todoappdemo.common.base.application.BaseApplication
import com.example.todoappdemo.databinding.ActivityMainBinding
import com.example.todoappdemo.presentation.addTaskActivity.activity.AddTaskActivity
import com.example.todoappdemo.presentation.mainActivity.viewModel.MainActivityViewModel
import com.example.todoappdemo.presentation.mainActivity.viewModel.TaskViewModelFactory
import com.example.todoappdemo.room.TaskItem
import com.example.todoappdemo.room.TaskListAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppBaseActivity<ActivityMainBinding>() {
    private val newTaskActivityRequestCode = 1
    val adapter = TaskListAdapter()
   // private val viewModel: MainActivityViewModel by viewModels()
   private val viewModel: MainActivityViewModel by viewModels {
       TaskViewModelFactory((application as BaseApplication).repository)
   }
    override fun init() {
        viewModel.allTask.observe(owner=this) { task ->
            task.let { adapter.submitList(it) }
        }
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

    override fun setEvents() {
        add_task_btn.setOnClickListener {
            val intent = Intent(this, AddTaskActivity::class.java)
            startAnotherActivity(intent)
        }
    }

    override fun setObservers() {
    }

    override fun getLayoutResId() = R.layout.activity_main
    override fun dataBinding(dataBinder: ActivityMainBinding) {

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)

        if (requestCode == newTaskActivityRequestCode && resultCode == Activity.RESULT_OK) {
            intentData?.getStringExtra(AddTaskActivity.EXTRA_REPLY)?.let { reply ->
                val task = TaskItem(reply)
                viewModel.insert(task)
            }
        }/* else {
        Toast.makeText(
            applicationContext,
            R.string.empty_not_saved,
            Toast.LENGTH_LONG
        ).show()
    }*/
    }
}