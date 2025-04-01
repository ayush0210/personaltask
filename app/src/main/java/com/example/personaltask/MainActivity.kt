package com.example.personaltask

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.personaltask.database.TaskViewModel

class MainActivity : ComponentActivity() {
    private lateinit var taskViewModel: TaskViewModel
    private lateinit var taskAdapter: TaskAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        taskAdapter = TaskAdapter(
            emptyList(), ontaskcompleted = { task ->
                taskViewModel.update(task)
            },
            ontaskdeleted = { task ->
                taskViewModel.delete(task)
            }
        )
        recyclerView.adapter = taskAdapter

        taskViewModel.allTasks.observe(this) { tasks ->
            taskAdapter.updateTasks(tasks)
        }

        val button: Button = findViewById(R.id.button)
        val textedit: EditText = findViewById(R.id.editTextText)
        button.setOnClickListener {
            val tasktitle = textedit.text.toString().trim()
            if (tasktitle.isNotEmpty()) {
                val task= Task(title=tasktitle)
                taskViewModel.insert(task)
                textedit.text.clear()
            } else {
                Toast.makeText(this, "Please enter a task", Toast.LENGTH_SHORT).show()
            }

        }
    }


}