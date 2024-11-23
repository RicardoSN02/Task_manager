package com.example.task.taskexample;

import com.example.task.taskexample.model.Task;
import com.example.task.taskexample.repository.TaskRepository;
import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanagerApplication implements CommandLineRunner {
    
    private final TaskRepository taskRepository;
    
    public TaskmanagerApplication(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public static void main(String[] args) {
	SpringApplication.run(TaskmanagerApplication.class, args);
    }

    
    @Override
    public void run(String... args) throws Exception{
        
    }
}
