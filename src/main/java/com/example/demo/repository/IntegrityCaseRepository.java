package com.example.demo.repository;

import com.example.demo.entity.IntegrityCase;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface IntegrityCaseRepository extends JpaRepository<IntegrityCase, Long> {
    List<IntegrityCase> findByStudentProfileId(Long studentProfileId);
    List<IntegrityCase> findRecentCasesByStatus(String status, LocalDate date);
    List<IntegrityCase> findByStudentIdentifier(String studentId);
}
