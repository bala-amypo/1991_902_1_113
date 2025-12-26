package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.StudentProfile;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.repository.StudentProfileRepository;
import com.example.demo.service.StudentProfileService;
import com.example.demo.util.RepeatOffenderCalculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final StudentProfileRepository studentProfileRepository;
    private final IntegrityCaseRepository integrityCaseRepository;
    private final RepeatOffenderCalculator calculator;

    public StudentProfileServiceImpl(
            StudentProfileRepository studentProfileRepository,
            IntegrityCaseRepository integrityCaseRepository,
            RepeatOffenderCalculator calculator
    ) {
        this.studentProfileRepository = studentProfileRepository;
        this.integrityCaseRepository = integrityCaseRepository;
        this.calculator = calculator;
    }

    @Override
    public StudentProfile createStudent(StudentProfile profile) {
        profile.setRepeatOffender(false);
        return studentProfileRepository.save(profile);
    }

    @Override
    public StudentProfile getStudentById(Long id) {
        return studentProfileRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return studentProfileRepository.findAll();
    }

    @Override
    public StudentProfile updateRepeatOffenderStatus(Long studentId) {
        StudentProfile profile = studentProfileRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        List<IntegrityCase> integrityCases =
                integrityCaseRepository.findByStudentId(studentId);

        boolean repeat =
                calculator.isRepeatOffender(profile, integrityCases);

        profile.setRepeatOffender(repeat);

        return studentProfileRepository.save(profile);
    }
}
