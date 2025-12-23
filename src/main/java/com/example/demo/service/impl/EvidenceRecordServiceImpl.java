package com.example.demo.service.impl;

import com.example.demo.entity.EvidenceRecord;
import com.example.demo.service.EvidenceRecordService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EvidenceRecordServiceImpl implements EvidenceRecordService {

    @Override
    public EvidenceRecord submitEvidence(EvidenceRecord e) {
        return e;
    }

    @Override
    public List<EvidenceRecord> getEvidenceByCase(Long caseId) {
        return List.of();
    }

    @Override
    public EvidenceRecord getEvidenceById(Long id) {
        return null;
    }

    @Override
    public List<EvidenceRecord> getAllEvidence() {
        return List.of();
    }
}
