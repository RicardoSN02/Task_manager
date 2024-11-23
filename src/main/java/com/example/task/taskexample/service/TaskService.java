/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.task.taskexample.service;

import com.example.task.taskexample.model.Task;
import com.example.task.taskexample.repository.TaskRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author rjsaa
 */
@Service
public class TaskService {
    private final TaskRepository taskRepository;
    
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    
    public List<Task> getTasks(){
        return taskRepository.findAll();
    }
    
    public void createTask(Task task){
        taskRepository.insert(task);
    }
}
