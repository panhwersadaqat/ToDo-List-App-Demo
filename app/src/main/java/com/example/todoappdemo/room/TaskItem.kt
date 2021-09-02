package com.example.todoappdemo.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Sadaqat Panhwer | https://panhwersadaqat.github.io/
 * on 9/2/2021
 */
@Entity(tableName = "task_table")
data class TaskItem(@PrimaryKey @ColumnInfo(name = "task") val task: String)
