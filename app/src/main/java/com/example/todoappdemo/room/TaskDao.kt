package com.example.todoappdemo.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * Created by Sadaqat Panhwer | https://panhwersadaqat.github.io/
 * on 9/2/2021
 */
@Dao
interface TaskDao {
    @Query("SELECT * FROM task_table ORDER BY task ASC")
    fun getAlphabetizedWords(): Flow<List<TaskItem>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(task: TaskItem)

    @Query("DELETE FROM task_table")
    suspend fun deleteAll()
}