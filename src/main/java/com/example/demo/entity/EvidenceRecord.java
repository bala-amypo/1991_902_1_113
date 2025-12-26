package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class EvidenceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String evidenceType;
    private LocalDateTime submittedAt;

    @ManyToOne
    private IntegrityCase integrityCase;

    public EvidenceRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getEvidenceType() { return evidenceType; }
    public void setEvidenceType(String evidenceType) { this.evidenceType = evidenceType; }

    public LocalDateTime getSubmittedAt() { return submittedAt; }
    public void setSubmittedAt(LocalDateTime submittedAt) { this.submittedAt = submittedAt; }

    public IntegrityCase getIntegrityCase() { return integrityCase; }
    public void setIntegrityCase(IntegrityCase integrityCase) { this.integrityCase = integrityCase; }
}
