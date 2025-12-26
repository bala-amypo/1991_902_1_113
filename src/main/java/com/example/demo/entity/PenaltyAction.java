package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class PenaltyAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details;
    private String issuedBy;

    public void setDetails(String details) {
        this.details = details;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
}
