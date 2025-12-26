package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.service.IntegrityCaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrityCaseServiceImpl implements IntegrityCaseService {

    private final IntegrityCaseRepository repository;

    public IntegrityCaseServiceImpl(IntegrityCaseRepository repository) {
        this.repository = repository;
    }

    @Override
    public IntegrityCase createCase(IntegrityCase integrityCase) {
        return repository.save(integrityCase);
    }

    @Override
    public IntegrityCase updateCaseStatus(Long caseId, String newStatus) {
        IntegrityCase integrityCase = repository.findById(caseId).orElse(null);
        if (integrityCase != null) {
            integrityCase.setStatus(newStatus);
            return repository.save(integrityCase);
        }
        return null;
    }

    @Override
    public List<IntegrityCase> getAllCases() {
        return repository.findAll();
    }

    @Override
    public IntegrityCase getCaseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<IntegrityCase> getCasesByStudent(Long studentId) {
        return repository.findByStudentId(studentId);
    }
}
