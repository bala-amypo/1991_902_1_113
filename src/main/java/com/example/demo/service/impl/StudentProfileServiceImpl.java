package com.example.demo.service.impl;

import com.example.demo.entity.StudentProfile;
import com.example.demo.exception.ResourceNotFoundException;
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
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with id: " + id
                        )
                );
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return students;
    }

    @Override
    public void updateRepeatOffenderStatus(Long studentId) {
        StudentProfile student = students.stream()
                .filter(s -> s.getId().equals(studentId))
                .findFirst()
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Student not found with id: " + studentId
                        )
                );

        student.setRepeatOffender(true);
    }
}
