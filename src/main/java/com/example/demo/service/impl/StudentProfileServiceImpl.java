package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.StudentProfileService;
import com.example.demo.util.RepeatOffenderCalculator;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final StudentProfileRepository studentProfileRepository;
    private final IntegrityCaseRepository integrityCaseRepository;
    private final RepeatOffenderCalculator calculator;

    public StudentProfileServiceImpl(
            StudentProfileRepository studentProfileRepository,
            IntegrityCaseRepository integrityCaseRepository,
            RepeatOffenderCalculator calculator) {
        this.studentProfileRepository = studentProfileRepository;
        this.integrityCaseRepository = integrityCaseRepository;
        this.calculator = calculator;
    }

    @Override
    public StudentProfile saveProfile(StudentProfile profile) {
        List<IntegrityCase> cases =
                integrityCaseRepository.findByStudentProfileId(profile.getId());
        profile.setRepeatOffender(
                calculator.isRepeatOffender(profile, cases)
        );
        return studentProfileRepository.save(profile);
    }
}
