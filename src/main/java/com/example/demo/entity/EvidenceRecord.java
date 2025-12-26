package com.example.demo.entity;

import java.time.LocalDateTime;

public class EvidenceRecord {

    private Long id;
    private IntegrityCase integrityCase;
    private String evidenceType;
    private String content;
    private String submittedBy;
    private LocalDateTime submittedAt = LocalDateTime.now();

    public EvidenceRecord() {}

    public Long getId() {
        return id;
    }

    public IntegrityCase getIntegrityCase() {
        return integrityCase;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIntegrityCase(IntegrityCase integrityCase) {
        this.integrityCase = integrityCase;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}
