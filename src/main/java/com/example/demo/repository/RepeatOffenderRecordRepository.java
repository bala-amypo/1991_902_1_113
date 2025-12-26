package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.*;

public interface RepeatOffenderRecordRepository extends JpaRepository<RepeatOffenderRecord, Long> {
    RepeatOffenderRecord findByStudentProfile(StudentProfile profile);
}
