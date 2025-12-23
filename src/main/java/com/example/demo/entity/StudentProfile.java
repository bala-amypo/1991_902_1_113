package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String studentId;

    private String name;

    @Column(unique = true)
    private String email;

    private String program;
    private Integer yearLevel;
    private Boolean isRepeatOffender = false;
    private LocalDateTime createdAt;

    @PrePersist
    void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }
    public Integer getYearLevel() { return yearLevel; }
    public void setYearLevel(Integer yearLevel) { this.yearLevel = yearLevel; }
    public Boolean getIsRepeatOffender() { return isRepeatOffender; }
    public void setIsRepeatOffender(Boolean isRepeatOffender) { this.isRepeatOffender = isRepeatOffender; }
}
