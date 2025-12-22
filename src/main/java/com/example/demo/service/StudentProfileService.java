package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.util.RepeatOffenderCalculator;
import java.util.List;

public class StudentProfileService {

    private final StudentProfileRepository studentRepo;
    private final IntegrityCaseRepository caseRepo;
    private final RepeatOffenderRecordRepository recordRepo;
    private final RepeatOffenderCalculator calculator;

    public StudentProfileService(
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
        return studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<StudentProfile> getAllStudents() {
        return studentRepo.findAll();
    }

    public void updateRepeatOffenderStatus(Long studentId) {
        StudentProfile s = getStudentById(studentId);
        List<IntegrityCase> cases = caseRepo.findByStudentProfile(s);

        if (cases.size() >= 2) {
            RepeatOffenderRecord record =
                calculator.computeRepeatOffenderRecord(s, cases);
            recordRepo.save(record);
            s.setIsRepeatOffender(true);
            studentRepo.save(s);
        }
    }
}
