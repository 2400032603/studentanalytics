package com.example.student_analytics.dto;

import java.util.List;

import com.example.student_analytics.entity.Performance;  // ✅ FIXED

public class StudentReportDTO {

    private List<Performance> marks;
    private double average;
    private String status;

    // Getters & Setters

    public List<Performance> getMarks() {
        return marks;
    }

    public void setMarks(List<Performance> marks) {
        this.marks = marks;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
