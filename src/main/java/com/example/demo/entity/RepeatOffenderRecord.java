package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RepeatOffenderRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private StudentProfile studentProfile;

    private int offenseCount;

    public RepeatOffenderRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public StudentProfile getStudentProfile() { return studentProfile; }
    public void setStudentProfile(StudentProfile studentProfile) { this.studentProfile = studentProfile; }

    public int getOffenseCount() { return offenseCount; }
    public void setOffenseCount(int offenseCount) { this.offenseCount = offenseCount; }
}
