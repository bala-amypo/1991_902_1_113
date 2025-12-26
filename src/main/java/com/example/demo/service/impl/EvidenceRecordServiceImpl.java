package com.example.demo.service.impl;

import com.example.demo.entity.EvidenceRecord;
import com.example.demo.repository.EvidenceRecordRepository;
import com.example.demo.service.EvidenceRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvidenceRecordServiceImpl implements EvidenceRecordService {

    private final EvidenceRecordRepository repository;

    public EvidenceRecordServiceImpl(EvidenceRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public EvidenceRecord submitEvidence(EvidenceRecord evidenceRecord) {
        return repository.save(evidenceRecord);
    }

    @Override
    public List<EvidenceRecord> getAllEvidence() {
        return repository.findAll();
    }

    @Override
    public EvidenceRecord getEvidenceById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<EvidenceRecord> getEvidenceByCase(Long caseId) {
        return repository.findAll();
    }
}
