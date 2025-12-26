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
    public StudentProfile createStudent(StudentProfile profile) {
        return studentProfileRepository.save(profile);
    }

    @Override
    public StudentProfile getStudentById(Long id) {
        return studentProfileRepository.findById(id).orElse(null);
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return studentProfileRepository.findAll();
    }

    @Override
    public StudentProfile updateRepeatOffenderStatus(Long studentProfileId) {
        StudentProfile profile =
                studentProfileRepository.findById(studentProfileId).orElse(null);

        if (profile == null) {
            return null;
        }

        List<IntegrityCase> cases =
                integrityCaseRepository.findByStudentProfileId(studentProfileId);

        profile.setRepeatOffender(
                calculator.isRepeatOffender(profile, cases)
        );

        return studentProfileRepository.save(profile);
    }
}
