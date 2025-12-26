package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.RepeatOffenderRecordService;
import com.example.demo.util.RepeatOffenderCalculator;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    private final StudentProfileRepository studentProfileRepository;
    private final IntegrityCaseRepository integrityCaseRepository;
    private final RepeatOffenderRecordRepository repository;
    private final RepeatOffenderCalculator calculator;

    public RepeatOffenderRecordServiceImpl(
            StudentProfileRepository studentProfileRepository,
            IntegrityCaseRepository integrityCaseRepository,
            RepeatOffenderRecordRepository repository,
            RepeatOffenderCalculator calculator) {
        this.studentProfileRepository = studentProfileRepository;
        this.integrityCaseRepository = integrityCaseRepository;
        this.repository = repository;
        this.calculator = calculator;
    }

    @Override
    public RepeatOffenderRecord refreshRepeatOffenderData(Long studentId) {
        StudentProfile profile = studentProfileRepository.findById(studentId).orElseThrow();
        List<IntegrityCase> cases = integrityCaseRepository.findByStudentProfileId(studentId);

        RepeatOffenderRecord record =
                repository.findByStudentProfile(profile).orElse(null);

        RepeatOffenderRecord updated =
                calculator.computeRepeatOffenderRecord(profile, cases);

        if (record != null) {
            updated.setId(record.getId());
        }

        return repository.save(updated);
    }

    @Override
    public RepeatOffenderRecord getRecordByStudent(Long studentId) {
        return repository.findByStudentProfileId(studentId).orElse(null);
    }

    @Override
    public List<RepeatOffenderRecord> getAllRepeatOffenders() {
        return repository.findAll();
    }
}
