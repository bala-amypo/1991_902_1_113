package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class IntegrityCase {

    private Long id;
    private StudentProfile studentProfile;
    private String courseCode;
    private String instructorName;
    private String description;
    private String status = "OPEN";
    private LocalDate incidentDate;
    private LocalDateTime createdAt = LocalDateTime.now();
    private List<PenaltyAction> penalties = new ArrayList<>();

    public IntegrityCase() {}

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<PenaltyAction> getPenalties() {
        return penalties;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
