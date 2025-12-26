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
    public List<IntegrityCase> getAllCases() {
        return repository.findAll();
    }

    @Override
    public List<IntegrityCase> getCasesByStudent(Long studentId) {
        return repository.findByStudentId(studentId);
    }
}
