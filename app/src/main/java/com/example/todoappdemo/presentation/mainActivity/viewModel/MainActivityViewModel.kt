package com.example.todoappdemo.presentation.mainActivity.viewModel

import androidx.lifecycle.*
import com.example.todoappdemo.common.base.viewModel.BaseViewModel
import com.example.todoappdemo.room.TaskItem
import com.example.todoappdemo.room.TaskRepository
import kotlinx.coroutines.launch

/**
 * Created by Sadaqat Panhwer | https://panhwersadaqat.github.io/
 * on 9/2/2021
 */
class MainActivityViewModel(private val taskRepository: TaskRepository) : ViewModel() {
    val allTask: LiveData<List<TaskItem>> = taskRepository.allTask.asLiveData()

    fun insert(taskItem: TaskItem) = viewModelScope.launch {
        taskRepository.insert(taskItem)
    }

    init {

    }
}
    class TaskViewModelFactory(private val taskRepository: TaskRepository) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return MainActivityViewModel(taskRepository) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }


}