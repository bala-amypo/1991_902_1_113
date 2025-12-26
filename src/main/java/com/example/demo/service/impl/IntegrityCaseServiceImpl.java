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
    public IntegrityCase saveCase(IntegrityCase integrityCase) {
        return repository.save(integrityCase);
    }

    @Override
    public List<IntegrityCase> getCasesByStudent(Long studentProfileId) {
        return repository.findByStudentProfileId(studentProfileId);
    }

    @Override
    public List<IntegrityCase> getAllCases() {
        return repository.findAll();
    }

    @Override
    public IntegrityCase getCaseById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
