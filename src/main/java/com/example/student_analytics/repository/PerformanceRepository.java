package com.example.student_analytics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_analytics.entity.Performance;

public interface PerformanceRepository extends JpaRepository<Performance, Integer> {

    List<Performance> findByStudentId(int studentId); 
}
