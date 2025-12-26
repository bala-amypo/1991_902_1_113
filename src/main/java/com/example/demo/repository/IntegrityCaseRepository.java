package com.example.demo.repository;

import com.example.demo.entity.IntegrityCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IntegrityCaseRepository extends JpaRepository<IntegrityCase, Long> {

    List<IntegrityCase> findByStudentId(Long studentId);

    List<IntegrityCase> findByStudentIdentifier(String studentIdentifier);

    List<IntegrityCase> findByStatus(String status);

    List<IntegrityCase> findRecentCasesByStatus(String status, LocalDate sinceDate);

    List<IntegrityCase> findByIncidentDateBetween(LocalDate start, LocalDate end);
}
