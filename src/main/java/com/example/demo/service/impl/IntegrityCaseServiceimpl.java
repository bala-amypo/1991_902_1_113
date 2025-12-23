package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.StudentProfile;
import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.repository.StudentProfileRepository;
import com.example.demo.service.IntegrityCaseService;
import java.util.List;

public class IntegrityCaseServiceImpl implements IntegrityCaseService {

    private final IntegrityCaseRepository caseRepo;
    private final StudentProfileRepository studentRepo;

    public IntegrityCaseServiceImpl(
            IntegrityCaseRepository caseRepo,
            StudentProfileRepository studentRepo) {
        this.caseRepo = caseRepo;
        this.studentRepo = studentRepo;
    }

    public IntegrityCase createCase(IntegrityCase c) {
        return caseRepo.save(c);
    }

    public IntegrityCase updateCaseStatus(Long id, String status) {
        IntegrityCase c = caseRepo.findById(id).orElseThrow();
        c.setStatus(status);
        return caseRepo.save(c);
    }

    public List<IntegrityCase> getCasesByStudent(Long studentId) {
        StudentProfile s = studentRepo.findById(studentId).orElseThrow();
        return caseRepo.findByStudentProfile(s);
    }

    public IntegrityCase getCaseById(Long id) {
        return caseRepo.findById(id).orElseThrow();
    }

    public List<IntegrityCase> getAllCases() {
        return caseRepo.findAll();
    }
}
