package com.example.student_analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_analytics.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
