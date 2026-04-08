package com.example.student_analytics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.student_analytics.entity.Student;
import com.example.student_analytics.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

    // ✅ GET all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // ✅ ADD THIS (VERY IMPORTANT)
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
}