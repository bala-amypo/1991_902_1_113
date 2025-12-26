package com.example.demo.service;

import com.example.demo.entity.IntegrityCase;

import java.util.List;

public interface IntegrityCaseService {

    IntegrityCase createCase(IntegrityCase integrityCase);

    IntegrityCase updateCaseStatus(Long caseId, String status);

    IntegrityCase getCaseById(Long id);

    List<IntegrityCase> getCasesByStudent(Long studentProfileId);

    List<IntegrityCase> getAllCases();
}
