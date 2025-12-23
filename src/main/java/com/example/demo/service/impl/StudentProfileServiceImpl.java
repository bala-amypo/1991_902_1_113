package com.example.demo.service.impl;

import com.example.demo.entity.StudentProfile;
import com.example.demo.service.StudentProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    @Override
    public StudentProfile createStudent(StudentProfile profile) {
        return profile;
    }

    @Override
    public StudentProfile getStudentById(Long id) {
        return null;
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return List.of();
    }

    @Override
    public void updateRepeatOffenderStatus(Long studentId) {
        
    }
}
