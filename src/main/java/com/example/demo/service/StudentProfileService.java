package com.example.demo.service;

import com.example.demo.entity.StudentProfile;

public interface StudentProfileService {

    StudentProfile saveProfile(StudentProfile profile);

    StudentProfile updateRepeatOffenderStatus(Long studentProfileId);
}
