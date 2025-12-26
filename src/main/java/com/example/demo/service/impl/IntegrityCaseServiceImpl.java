package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.service.IntegrityCaseService;

import java.util.List;
import java.util.Optional;

public class IntegrityCaseServiceImpl implements IntegrityCaseService {

    private final IntegrityCaseRepository integrityCaseRepository;

    public IntegrityCaseServiceImpl(IntegrityCaseRepository integrityCaseRepository) {
        this.integrityCaseRepository = integrityCaseRepository;
    }

    public IntegrityCase createCase(IntegrityCase integrityCase) {
        return integrityCaseRepository.save(integrityCase);
    }

    public IntegrityCase updateCaseStatus(Long caseId, String newStatus) {
        IntegrityCase c = integrityCaseRepository.findById(caseId).orElseThrow();
        c.setStatus(newStatus);
        return integrityCaseRepository.save(c);
    }

    public List<IntegrityCase> getCasesByStudent(Long studentId) {
        return integrityCaseRepository.findByStudentProfileId(studentId);
    }

    public Optional<IntegrityCase> getCaseById(Long caseId) {
        return integrityCaseRepository.findById(caseId);
    }
}
