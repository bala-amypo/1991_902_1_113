package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PenaltyAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String penaltyType;
    private String details;
    private LocalDateTime issuedAt;

    @ManyToOne
    private IntegrityCase integrityCase;

    public PenaltyAction() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPenaltyType() { return penaltyType; }
    public void setPenaltyType(String penaltyType) { this.penaltyType = penaltyType; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public LocalDateTime getIssuedAt() { return issuedAt; }
    public void setIssuedAt(LocalDateTime issuedAt) { this.issuedAt = issuedAt; }

    public IntegrityCase getIntegrityCase() { return integrityCase; }
    public void setIntegrityCase(IntegrityCase integrityCase) { this.integrityCase = integrityCase; }
}
