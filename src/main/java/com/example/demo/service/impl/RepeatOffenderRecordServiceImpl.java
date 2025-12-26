package com.example.demo.service.impl;

import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.repository.RepeatOffenderRecordRepository;
import com.example.demo.service.RepeatOffenderRecordService;

import java.util.List;

public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    private final RepeatOffenderRecordRepository repository;

    public RepeatOffenderRecordServiceImpl(RepeatOffenderRecordRepository repository) {
        this.repository = repository;
    }

    public RepeatOffenderRecord refreshRepeatOffenderData(Long studentId) {
        return repository.findByStudentProfileId(studentId).orElseThrow();
    }

    public RepeatOffenderRecord getRecordByStudent(Long studentId) {
        return repository.findByStudentProfileId(studentId).orElseThrow();
    }

    public List<RepeatOffenderRecord> getAllRepeatOffenders() {
        return repository.findAll();
    }
}
