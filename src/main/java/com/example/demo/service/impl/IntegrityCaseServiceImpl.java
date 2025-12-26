package com.example.demo.service.impl;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.StudentProfile;
import com.example.demo.repository.IntegrityCaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IntegrityCaseServiceImpl {

    private final IntegrityCaseRepository repository;

    public List<IntegrityCase> findByStudent(StudentProfile student) {
        return repository.findByStudentProfile(student);
    }
}
