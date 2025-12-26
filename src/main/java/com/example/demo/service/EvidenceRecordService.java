package com.example.demo.service;

import com.example.demo.entity.EvidenceRecord;
import java.util.List;

public interface EvidenceRecordService {

    EvidenceRecord submitEvidence(EvidenceRecord evidenceRecord);

    List<EvidenceRecord> getEvidenceByCase(Long caseId);

    EvidenceRecord getEvidenceById(Long id);

    List<EvidenceRecord> getAllEvidence();
}
