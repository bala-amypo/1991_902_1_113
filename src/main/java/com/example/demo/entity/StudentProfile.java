package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentIdentifier;

    private boolean repeatOffender;

    @OneToMany(mappedBy = "studentProfile", cascade = CascadeType.ALL)
    private List<IntegrityCase> integrityCases = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentIdentifier() {
        return studentIdentifier;
    }

    public void setStudentIdentifier(String studentIdentifier) {
        this.studentIdentifier = studentIdentifier;
    }

    public boolean isRepeatOffender() {
        return repeatOffender;
    }

    public void setRepeatOffender(boolean repeatOffender) {
        this.repeatOffender = repeatOffender;
    }

    public List<IntegrityCase> getIntegrityCases() {
        return integrityCases;
    }

    public void setIntegrityCases(List<IntegrityCase> integrityCases) {
        this.integrityCases = integrityCases;
    }
}
