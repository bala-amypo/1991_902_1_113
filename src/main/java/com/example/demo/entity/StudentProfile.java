package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentId;
    private String name;
    private String email;
    private String program;
    private Integer yearLevel;
    private Boolean repeatOffender = false;
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "studentProfile")
    private List<IntegrityCase> integrityCases = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public Boolean getRepeatOffender() {
        return repeatOffender;
    }

    public void setRepeatOffender(Boolean repeatOffender) {
        this.repeatOffender = repeatOffender;
    }

    public List<IntegrityCase> getIntegrityCases() {
        return integrityCases;
    }
}
