/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.task.taskexample.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author rjsaa
 */
@Entity
@Table(name= "tasks")
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String descripcion;
    
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechainicio;
   
    public Task() {
    }

    public Task(String nombre, String descripcion, LocalDate fechainicio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
    }

    public Task(long id, String nombre, String descripcion, LocalDate fechainicio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }
    

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechainicio=" + fechainicio + '}';
    }
    
    
    
}
