package com.example.demo.service.impl;

import com.example.demo.entity.StudentProfile;
import com.example.demo.repository.StudentProfileRepository;
import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.repository.RepeatOffenderRecordRepository;
import com.example.demo.service.StudentProfileService;
import com.example.demo.util.RepeatOffenderCalculator;

import java.util.List;

public class StudentProfileServiceImpl implements StudentProfileService {

    private final StudentProfileRepository studentProfileRepository;
    private final IntegrityCaseRepository integrityCaseRepository;
    private final RepeatOffenderRecordRepository repeatOffenderRecordRepository;
    private final RepeatOffenderCalculator calculator;

    public StudentProfileServiceImpl(
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

    public StudentProfile createStudent(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    public StudentProfile getStudentById(Long id) {
        return studentProfileRepository.findById(id).orElseThrow();
    }

    public List<StudentProfile> getAllStudents() {
        return studentProfileRepository.findAll();
    }

    public StudentProfile updateRepeatOffenderStatus(Long studentId) {
        StudentProfile profile = getStudentById(studentId);
        profile.setRepeatOffender(calculator.isRepeatOffender(profile.getIntegrityCases()));
        return studentProfileRepository.save(profile);
    }
}
