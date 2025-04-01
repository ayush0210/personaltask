package com.example.personaltask.database

import androidx.lifecycle.LiveData
import com.example.personaltask.Task

class TaskRepository(private val taskDao: TaskDao) {
    val allTasks: LiveData<List<Task>> = taskDao.getAllTasks()
    suspend fun insert(task: Task)
    {
        taskDao.insert(task)
    }

    suspend fun delete(task: Task){
        taskDao.delete(task)
    }

    suspend fun update(task: Task){
        taskDao.update(task)
    }

}