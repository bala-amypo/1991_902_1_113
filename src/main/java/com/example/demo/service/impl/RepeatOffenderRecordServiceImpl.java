package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.RepeatOffenderRecordService;
import com.example.demo.util.RepeatOffenderCalculator;

@Service
public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    private final RepeatOffenderRecordRepository repository;
    private final RepeatOffenderCalculator calculator;

    public RepeatOffenderRecordServiceImpl(
            RepeatOffenderRecordRepository repository,
            RepeatOffenderCalculator calculator) {
        this.repository = repository;
        this.calculator = calculator;
    }

    @Override
    public RepeatOffenderRecord refreshRepeatOffenderData(StudentProfile profile, List<IntegrityCase> cases) {
        RepeatOffenderRecord record =
                repository.findByStudentProfile(profile);

        if (record == null) {
            record = calculator.computeRepeatOffenderRecord(profile, cases);
        } else {
            record.setTotalCases(cases.size());
            record.setFlagSeverity(cases.size() >= 3 ? "HIGH" : "LOW");
        }

        return repository.save(record);
    }

    @Override
    public RepeatOffenderRecord getRecordByStudent(Long studentProfileId) {
        return repository.findByStudentProfileId(studentProfileId);
    }

    @Override
    public List<RepeatOffenderRecord> getAllRepeatOffenders() {
        return repository.findAll();
    }
}
