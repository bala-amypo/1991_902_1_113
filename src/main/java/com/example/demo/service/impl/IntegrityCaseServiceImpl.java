package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.service.IntegrityCaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrityCaseServiceImpl implements IntegrityCaseService {

    @Override
    public IntegrityCase createCase(IntegrityCase c) {
        return c;
    }

    @Override
    public IntegrityCase updateCaseStatus(Long id, String status) {
        return null;
    }

    @Override
    public List<IntegrityCase> getCasesByStudent(Long studentId) {
        return List.of();
    }

    @Override
    public IntegrityCase getCaseById(Long id) {
        return null;
    }

    @Override
    public List<IntegrityCase> getAllCases() {
        return List.of();
    }
}
