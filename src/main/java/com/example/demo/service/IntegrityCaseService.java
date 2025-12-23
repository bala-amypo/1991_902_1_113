package com.example.demo.service;

import com.example.demo.entity.IntegrityCase;
import java.util.List;

public interface IntegrityCaseService {

    IntegrityCase createCase(IntegrityCase c);

    IntegrityCase updateCaseStatus(Long id, String status);

    List<IntegrityCase> getCasesByStudent(Long studentId);

    IntegrityCase getCaseById(Long id);

    List<IntegrityCase> getAllCases();
}
