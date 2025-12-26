package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.entity.*;

public interface EvidenceRecordRepository extends JpaRepository<EvidenceRecord, Long> {
    List<EvidenceRecord> findByIntegrityCase(IntegrityCase integrityCase);
}
