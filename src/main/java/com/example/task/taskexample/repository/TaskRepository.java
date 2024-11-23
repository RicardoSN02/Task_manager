/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.task.taskexample.repository;

import com.example.task.taskexample.model.Task;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author rjsaa
 */
@Mapper
public interface TaskRepository {
    
   @Select("SELECT * FROM tasks") 
   List<Task> findAll();
   
   @Insert(" INSERT INTO tasks (nombre, descripcion, fechainicio)"
           + "VALUES (#{nombre}, #{descripcion}, #{fechainicio});")
   void insert(Task task);   
}
