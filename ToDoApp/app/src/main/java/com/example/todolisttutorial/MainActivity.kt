package com.example.todolisttutorial

import TaskViewModel
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.todolisttutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)

        binding.newTaskButton.setOnClickListener {
            NewTaskSheet().show(supportFragmentManager, "newTaskTag")
        }

        taskViewModel.name.observe(this) { name ->
            binding.taskName.text = String.format("Task Name: %s", name)
        }

        taskViewModel.desc.observe(this) { desc ->
            binding.taskDesc.text = String.format("Task Desc: %s", desc)
        }
    }
}
