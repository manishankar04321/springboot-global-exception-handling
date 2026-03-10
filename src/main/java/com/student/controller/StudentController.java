package com.student.controller;

import org.springframework.web.bind.annotation.*;

import com.student.exception.InvalidInputException;
import com.student.exception.StudentNotFoundException;
import com.student.model.Student;

@RestController
public class StudentController {

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){

        if(id<=0){
            throw new InvalidInputException("Invalid student ID format");
        }

        if(id!=1){
            throw new StudentNotFoundException("Student not found with ID: "+id);
        }

        return new Student(1,"Mani","Computer Science");
    }
}