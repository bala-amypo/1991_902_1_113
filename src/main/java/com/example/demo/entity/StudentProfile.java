package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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

    @OneToMany(mappedBy = "studentProfile")
    private List<IntegrityCase> integrityCases;

    @PrePersist
    void onCreate() {
        createdAt = LocalDateTime.now();
    }

    // getters & setters
}
