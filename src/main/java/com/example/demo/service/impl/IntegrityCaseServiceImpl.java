package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.IntegrityCaseService;

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
    public IntegrityCase getCaseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<IntegrityCase> getAllCases() {
        return repository.findAll();
    }

    @Override
    public List<IntegrityCase> getCasesByStudent(Long studentProfileId) {
        return repository.findByStudentProfileId(studentProfileId);
    }

    @Override
    public IntegrityCase updateCaseStatus(Long id, String status) {
        IntegrityCase c = repository.findById(id).orElse(null);
        if (c != null) {
            c.setStatus(status);
            repository.save(c);
        }
        return c;
    }
}
