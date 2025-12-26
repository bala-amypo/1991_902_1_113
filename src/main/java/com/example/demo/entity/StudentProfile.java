package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentProfile {

    private Long id;
    private String studentId;
    private String name;
    private String email;
    private String program;
    private Integer yearLevel;
    private Boolean repeatOffender = false;
    private LocalDateTime createdAt = LocalDateTime.now();
    private List<IntegrityCase> integrityCases = new ArrayList<>();

    public StudentProfile() {}

    public Long getId() {
        return id;
    }

    public String getStudentId() {
        return studentId;
    }

    public Boolean getRepeatOffender() {
        return repeatOffender;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<IntegrityCase> getIntegrityCases() {
        return integrityCases;
    }

    public Integer getYearLevel() {
        return yearLevel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setRepeatOffender(Boolean repeatOffender) {
        this.repeatOffender = repeatOffender;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
