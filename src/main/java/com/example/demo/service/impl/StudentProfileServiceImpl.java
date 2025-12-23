package com.example.demo.service.impl;

import com.example.demo.entity.StudentProfile;
import com.example.demo.service.StudentProfileService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final List<StudentProfile> students = new ArrayList<>();

    @Override
    public StudentProfile createStudent(StudentProfile profile) {
        students.add(profile);
        return profile;
    }

    @Override
    public StudentProfile getStudentById(Long id) {
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return students;
    }

    @Override
    public void updateRepeatOffenderStatus(Long studentId) {
        
    }
}
