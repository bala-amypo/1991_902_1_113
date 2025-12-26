package com.example.demo.service;

import com.example.demo.entity.IntegrityCase;
import java.util.List;

public interface IntegrityCaseService {

    IntegrityCase createCase(IntegrityCase integrityCase);

    IntegrityCase updateCaseStatus(Long caseId, String newStatus);

    IntegrityCase getCaseById(Long caseId);

    List<IntegrityCase> getCasesByStudent(Long studentId);

    List<IntegrityCase> getAllCases();
}
