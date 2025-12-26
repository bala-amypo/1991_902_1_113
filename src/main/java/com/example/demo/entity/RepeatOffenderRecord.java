package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RepeatOffenderRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalCases;
    private String flagSeverity;

    @OneToOne
    private StudentProfile studentProfile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public void setFlagSeverity(String flagSeverity) {
        this.flagSeverity = flagSeverity;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }
}
