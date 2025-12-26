package com.example.demo.service.impl;

import com.example.demo.entity.EvidenceRecord;
import com.example.demo.repository.EvidenceRecordRepository;
import com.example.demo.service.EvidenceRecordService;

public class EvidenceRecordServiceImpl implements EvidenceRecordService {

    private final EvidenceRecordRepository evidenceRecordRepository;

    public EvidenceRecordServiceImpl(EvidenceRecordRepository evidenceRecordRepository) {
        this.evidenceRecordRepository = evidenceRecordRepository;
    }

    public EvidenceRecord submitEvidence(EvidenceRecord evidenceRecord) {
        return evidenceRecordRepository.save(evidenceRecord);
    }
}
