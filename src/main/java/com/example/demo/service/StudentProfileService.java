package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentProfile;

public interface StudentProfileService {

    StudentProfile createStudent(StudentProfile profile);

    StudentProfile getStudentById(Long id);

    List<StudentProfile> getAllStudents();

    StudentProfile updateRepeatOffenderStatus(Long studentProfileId);
}
