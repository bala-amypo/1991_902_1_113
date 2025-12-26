package com.example.demo.util;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.entity.StudentProfile;
import java.util.List;

public class RepeatOffenderCalculator {

    public RepeatOffenderRecord computeRepeatOffenderRecord(StudentProfile student, List<IntegrityCase> cases) {
        RepeatOffenderRecord record = new RepeatOffenderRecord();
        record.setStudentProfile(student);
        record.setTotalCases(cases.size());
        record.setFlagSeverity(cases.size() > 2 ? "HIGH" : "LOW");
        return record;
    }

    public boolean isRepeatOffender(StudentProfile student, List<IntegrityCase> cases) {
        return cases.size() > 2;
    }
}
