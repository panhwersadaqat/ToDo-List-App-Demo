package com.example.todoappdemo.presentation.addTaskActivity.activity

import androidx.activity.viewModels
import com.example.todoappdemo.R
import com.example.todoappdemo.common.base.activity.AppBaseActivity
import com.example.todoappdemo.common.base.application.BaseApplication
import com.example.todoappdemo.databinding.ActivityAddTaskBinding
import com.example.todoappdemo.presentation.mainActivity.viewModel.MainActivityViewModel
import com.example.todoappdemo.presentation.mainActivity.viewModel.TaskViewModelFactory
import com.example.todoappdemo.room.TaskItem
import kotlinx.android.synthetic.main.activity_add_task.*


class AddTaskActivity : AppBaseActivity<ActivityAddTaskBinding>() {
  //  private val viewModel: AddTaskViewModel by viewModels()
    private val viewModel: MainActivityViewModel by viewModels {
        TaskViewModelFactory((application as BaseApplication).repository)
    }
    override fun init() {



    }

    override fun setEvents() {
        button_save.setOnClickListener {
/*            val replyIntent = Intent()
            if (TextUtils.isEmpty(edit_word.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val taskText = edit_word.text.toString()
                replyIntent.putExtra(EXTRA_REPLY, taskText)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()*/
            val taskText = edit_task.text.toString()
            val task = TaskItem(taskText)
            viewModel.insert(task)
            finish()
        }
    }

    override fun setObservers() {

    }

    override fun getLayoutResId() = R.layout.activity_add_task
    override fun dataBinding(dataBinder: ActivityAddTaskBinding) {

    }

/*    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }*/
}