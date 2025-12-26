package com.example.demo.service;

import com.example.demo.entity.IntegrityCase;

import java.util.List;

public interface IntegrityCaseService {

    IntegrityCase saveCase(IntegrityCase integrityCase);

    List<IntegrityCase> getCasesByStudent(Long studentProfileId);

    List<IntegrityCase> getAllCases();

    IntegrityCase getCaseById(Long id);
}
