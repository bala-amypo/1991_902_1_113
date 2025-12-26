package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.entity.*;

public interface IntegrityCaseRepository extends JpaRepository<IntegrityCase, Long> {
    List<IntegrityCase> findByStudentProfile(StudentProfile profile);
}
