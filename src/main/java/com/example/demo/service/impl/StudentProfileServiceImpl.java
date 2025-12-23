package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.StudentProfileService;
import com.example.demo.util.RepeatOffenderCalculator;
import java.util.List;

public class StudentProfileServiceImpl implements StudentProfileService {

    private final StudentProfileRepository studentRepo;
    private final IntegrityCaseRepository caseRepo;
    private final RepeatOffenderRecordRepository recordRepo;
    private final RepeatOffenderCalculator calculator;

    public StudentProfileServiceImpl(
            StudentProfileRepository studentRepo,
            IntegrityCaseRepository caseRepo,
            RepeatOffenderRecordRepository recordRepo,
            RepeatOffenderCalculator calculator) {
        this.studentRepo = studentRepo;
        this.caseRepo = caseRepo;
        this.recordRepo = recordRepo;
        this.calculator = calculator;
    }

    public StudentProfile createStudent(StudentProfile s) {
        return studentRepo.save(s);
    }

    public StudentProfile getStudentById(Long id) {
        return studentRepo.findById(id).orElseThrow();
    }

    public List<StudentProfile> getAllStudents() {
        return studentRepo.findAll();
    }

    public void updateRepeatOffenderStatus(Long id) {
        StudentProfile s = getStudentById(id);
        List<IntegrityCase> cases = caseRepo.findByStudentProfile(s);
        if (cases.size() >= 2) {
            recordRepo.save(calculator.computeRepeatOffenderRecord(s, cases));
            s.setIsRepeatOffender(true);
            studentRepo.save(s);
        }
    }
}
