package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class EvidenceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String evidenceType;
    private String submittedBy;

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }
}
