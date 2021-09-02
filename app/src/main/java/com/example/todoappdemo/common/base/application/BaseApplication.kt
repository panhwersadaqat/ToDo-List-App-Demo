package com.example.todoappdemo.common.base.application

import android.app.Application
import com.example.todoappdemo.room.TaskRepository
import com.example.todoappdemo.room.TaskRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

/**
 * Created by Sadaqat Panhwer | https://panhwersadaqat.github.io/
 * on 9/2/2021
 */
class BaseApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy { TaskRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { TaskRepository(database.taskDao()) }

}