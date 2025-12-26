package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.service.IntegrityCaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IntegrityCaseServiceImpl implements IntegrityCaseService {

    private final IntegrityCaseRepository repository;

    @Override
    public IntegrityCase createCase(IntegrityCase integrityCase) {
        return repository.save(integrityCase);
    }

    @Override
    public IntegrityCase updateCaseStatus(Long caseId, String status) {
        IntegrityCase c = repository.findById(caseId).orElse(null);
        if (c == null) {
            return null;
        }
        c.setStatus(status);
        return repository.save(c);
    }

    @Override
    public IntegrityCase getCaseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<IntegrityCase> getCasesByStudent(Long studentProfileId) {
        return repository.findByStudentProfileId(studentProfileId);
    }

    @Override
    public List<IntegrityCase> getAllCases() {
        return repository.findAll();
    }
}
