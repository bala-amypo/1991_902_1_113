package com.example.demo.entity;

import java.time.LocalDateTime;

public class PenaltyAction {

    private Long id;
    private IntegrityCase integrityCase;
    private String penaltyType;
    private String details;
    private String issuedBy;
    private LocalDateTime issuedAt = LocalDateTime.now();

    public PenaltyAction() {}

    public Long getId() {
        return id;
    }

    public IntegrityCase getIntegrityCase() {
        return integrityCase;
    }

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIntegrityCase(IntegrityCase integrityCase) {
        this.integrityCase = integrityCase;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
        this.issuedAt = issuedAt;
    }
}
