package com.example.demo.service.impl;

import com.example.demo.repository.EvidenceRecordRepository;
import com.example.demo.service.EvidenceRecordService;
import org.springframework.stereotype.Service;

@Service
public class EvidenceRecordServiceImpl implements EvidenceRecordService {

    private final EvidenceRecordRepository evidenceRecordRepository;

    public EvidenceRecordServiceImpl(EvidenceRecordRepository evidenceRecordRepository) {
        this.evidenceRecordRepository = evidenceRecordRepository;
    }
}
