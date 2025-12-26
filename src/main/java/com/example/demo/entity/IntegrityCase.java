package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "integrity_cases")
public class IntegrityCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caseType;

    private String description;

    private String status;

    private LocalDateTime incidentDate;

    @ManyToOne
    @JoinColumn(name = "student_profile_id")
    private StudentProfile studentProfile;

    @OneToMany(mappedBy = "integrityCase", cascade = CascadeType.ALL)
    private List<EvidenceRecord> evidenceRecords;

    @OneToMany(mappedBy = "integrityCase", cascade = CascadeType.ALL)
    private List<PenaltyAction> penaltyActions;

    public IntegrityCase() {
    }

    public Long getId() {
        return id;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(LocalDateTime incidentDate) {
        this.incidentDate = incidentDate;
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public List<EvidenceRecord> getEvidenceRecords() {
        return evidenceRecords;
    }

    public void setEvidenceRecords(List<EvidenceRecord> evidenceRecords) {
        this.evidenceRecords = evidenceRecords;
    }

    public List<PenaltyAction> getPenaltyActions() {
        return penaltyActions;
    }

    public void setPenaltyActions(List<PenaltyAction> penaltyActions) {
        this.penaltyActions = penaltyActions;
    }
}
