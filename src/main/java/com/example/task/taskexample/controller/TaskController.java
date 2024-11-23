/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.task.taskexample.controller;

import com.example.task.taskexample.model.Task;
import com.example.task.taskexample.service.TaskService;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author rjsaa
 */
@Controller
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }
    
    @GetMapping("/home")
    public String home(Model model){
        return "index";
    }
    
    @GetMapping("/new")
    public String createTaskFr(Model model){
        model.addAttribute("task",new Task());
        return "create_task";
    }
    
    @GetMapping("/list")
    public String listTasksFr(Model model){
        return "list_tasks";
    }
    
    @PostMapping("/")
    @ResponseBody
    public Task createTask(@RequestBody Task task){
        
        if(!task.toString().isEmpty()){
            taskService.createTask(task);
            return task;
        }else{
            return task;
        }
        
    }
    
    @GetMapping("/")
    @ResponseBody
    public List<Task> listTasks(){
        List<Task> tareas = taskService.getTasks();
        return tareas;
    }
    
}
