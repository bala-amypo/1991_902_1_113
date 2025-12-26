package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.entity.StudentProfile;
import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.repository.RepeatOffenderRecordRepository;
import com.example.demo.repository.StudentProfileRepository;
import com.example.demo.service.RepeatOffenderRecordService;
import com.example.demo.util.RepeatOffenderCalculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    private final StudentProfileRepository studentProfileRepository;
    private final IntegrityCaseRepository integrityCaseRepository;
    private final RepeatOffenderRecordRepository repeatOffenderRecordRepository;
    private final RepeatOffenderCalculator calculator;

    public RepeatOffenderRecordServiceImpl(
            StudentProfileRepository studentProfileRepository,
            IntegrityCaseRepository integrityCaseRepository,
            RepeatOffenderRecordRepository repeatOffenderRecordRepository,
            RepeatOffenderCalculator calculator
    ) {
        this.studentProfileRepository = studentProfileRepository;
        this.integrityCaseRepository = integrityCaseRepository;
        this.repeatOffenderRecordRepository = repeatOffenderRecordRepository;
        this.calculator = calculator;
    }

    // 🔴 THIS METHOD WAS MISSING → CAUSED COMPILATION ERROR
    @Override
    public RepeatOffenderRecord updateRepeatOffenderRecord(StudentProfile studentProfile) {

        // 1. Fetch all integrity cases of the student
        List<IntegrityCase> cases =
                integrityCaseRepository.findByStudentProfile(studentProfile);

        // 2. Compute repeat offender record
        RepeatOffenderRecord record =
                calculator.computeRepeatOffenderRecord(studentProfile, cases);

        // 3. Save repeat offender record
        repeatOffenderRecordRepository.save(record);

        // 4. Update student repeat offender flag
        studentProfile.setRepeatOffender(record.getTotalCases() >= 2);
        studentProfileRepository.save(studentProfile);

        return record;
    }
}
