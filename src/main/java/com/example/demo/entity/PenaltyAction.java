package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PenaltyAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String penaltyType;
    private String details;
    private LocalDateTime issuedAt;

    @ManyToOne
    private IntegrityCase integrityCase;
}
