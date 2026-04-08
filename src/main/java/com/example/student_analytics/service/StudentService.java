package com.example.student_analytics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_analytics.entity.Student;
import com.example.student_analytics.entity.Performance;
import com.example.student_analytics.repository.PerformanceRepository;
import com.example.student_analytics.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private PerformanceRepository performanceRepo;

    // Add student
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // Add performance
    public Performance addPerformance(Performance performance) {
        return performanceRepo.save(performance);
    }

    // Get performance
    public List<Performance> getPerformanceByStudentId(int studentId) {
        return performanceRepo.findByStudentId(studentId);
    }

    // Calculate average
    public double calculateAverage(int studentId) {
        List<Performance> list = performanceRepo.findByStudentId(studentId);

        return list.stream()
                .mapToInt(p -> p.getMarks())
                .average()
                .orElse(0);
    }

    // Status
    public String getPerformanceStatus(int studentId) {
        double avg = calculateAverage(studentId);

        if (avg >= 75) return "Excellent";
        else if (avg >= 50) return "Average";
        else return "Needs Improvement";
    }
}
