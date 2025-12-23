package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.RepeatOffenderRecordService;
import com.example.demo.util.RepeatOffenderCalculator;
import java.util.List;

public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    private final StudentProfileRepository studentRepo;
    private final IntegrityCaseRepository caseRepo;
    private final RepeatOffenderRecordRepository recordRepo;
    private final RepeatOffenderCalculator calculator;

    public RepeatOffenderRecordServiceImpl(
            StudentProfileRepository studentRepo,
            IntegrityCaseRepository caseRepo,
            RepeatOffenderRecordRepository recordRepo,
            RepeatOffenderCalculator calculator) {
        this.studentRepo = studentRepo;
        this.caseRepo = caseRepo;
        this.recordRepo = recordRepo;
        this.calculator = calculator;
    }

    public void refreshRepeatOffenderData(Long studentId) {
        StudentProfile s = studentRepo.findById(studentId).orElseThrow();
        List<IntegrityCase> cases = caseRepo.findByStudentProfile(s);
        if (cases.size() >= 2) {
            recordRepo.save(calculator.computeRepeatOffenderRecord(s, cases));
        }
    }

    public RepeatOffenderRecord getRecordByStudent(Long studentId) {
        StudentProfile s = studentRepo.findById(studentId).orElseThrow();
        return recordRepo.findByStudentProfile(s);
    }

    public List<RepeatOffenderRecord> getAllRepeatOffenders() {
        return recordRepo.findAll();
    }
}
