package com.example.personaltask

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long =0,
    val title: String,
    var checklist: Boolean = false
)
