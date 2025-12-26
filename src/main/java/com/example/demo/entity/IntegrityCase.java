package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class IntegrityCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentIdentifier;
    private String instructorName;
    private String description;
    private String status;
    private LocalDate incidentDate;
    private String courseCode;

    @ManyToOne
    private StudentProfile studentProfile;

    @OneToMany(mappedBy = "integrityCase")
    private List<EvidenceRecord> evidenceRecords;

    @OneToMany(mappedBy = "integrityCase")
    private List<PenaltyAction> penaltyActions;

    public IntegrityCase() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentIdentifier() { return studentIdentifier; }
    public void setStudentIdentifier(String studentIdentifier) { this.studentIdentifier = studentIdentifier; }

    public String getInstructorName() { return instructorName; }
    public void setInstructorName(String instructorName) { this.instructorName = instructorName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getIncidentDate() { return incidentDate; }
    public void setIncidentDate(LocalDate incidentDate) { this.incidentDate = incidentDate; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public StudentProfile getStudentProfile() { return studentProfile; }
    public void setStudentProfile(StudentProfile studentProfile) { this.studentProfile = studentProfile; }

    public List<EvidenceRecord> getEvidenceRecords() { return evidenceRecords; }
    public List<PenaltyAction> getPenaltyActions() { return penaltyActions; }
}
