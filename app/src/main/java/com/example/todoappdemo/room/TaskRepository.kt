package com.example.todoappdemo.room

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

/**
 * Created by Sadaqat Panhwer | https://panhwersadaqat.github.io/
 * on 9/2/2021
 */
class TaskRepository(private val taskDao: TaskDao) {

    val allWords: Flow<List<TaskItem>> = taskDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(task: TaskItem) {
        taskDao.insert(task)
    }
}