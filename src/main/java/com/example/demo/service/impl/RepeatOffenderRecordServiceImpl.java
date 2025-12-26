package com.example.demo.service.impl;

import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.repository.RepeatOffenderRecordRepository;
import com.example.demo.service.RepeatOffenderRecordService;

public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    private final RepeatOffenderRecordRepository repository;

    public RepeatOffenderRecordServiceImpl(RepeatOffenderRecordRepository repository) {
        this.repository = repository;
    }

    public RepeatOffenderRecord recalculate(Long studentProfileId) {
        return repository.findByStudentProfileId(studentProfileId).orElseThrow();
    }
}
