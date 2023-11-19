package com.dicoding.todoapp.ui.add

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.todoapp.data.Task
import com.dicoding.todoapp.data.TaskRepository
import kotlinx.coroutines.launch

class ViewModelAddTask(private val taskRepository: TaskRepository) : ViewModel() {

    fun adTask(task: Task) {
        viewModelScope.launch {
            taskRepository.insertTask(task)
        }
    }
}