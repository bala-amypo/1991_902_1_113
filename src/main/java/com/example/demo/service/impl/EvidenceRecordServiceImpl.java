package com.example.demo.service.impl;

import com.example.demo.entity.EvidenceRecord;
import com.example.demo.repository.EvidenceRecordRepository;
import com.example.demo.service.EvidenceRecordService;

import java.util.List;

public class EvidenceRecordServiceImpl implements EvidenceRecordService {

    private final EvidenceRecordRepository repository;

    public EvidenceRecordServiceImpl(EvidenceRecordRepository repository) {
        this.repository = repository;
    }

    public EvidenceRecord submitEvidence(EvidenceRecord evidenceRecord) {
        return repository.save(evidenceRecord);
    }

    public List<EvidenceRecord> getEvidenceByCase(Long caseId) {
        return repository.findAll();
    }

    public EvidenceRecord getEvidenceById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<EvidenceRecord> getAllEvidence() {
        return repository.findAll();
    }
}
