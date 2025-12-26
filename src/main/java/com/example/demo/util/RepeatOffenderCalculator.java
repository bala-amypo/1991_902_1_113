package com.example.demo.util;

import com.example.demo.entity.*;
import java.util.List;

public class RepeatOffenderCalculator {

    public boolean isRepeatOffender(StudentProfile student, List<IntegrityCase> cases) {
        return cases.size() >= 2;
    }

    public RepeatOffenderRecord computeRepeatOffenderRecord(StudentProfile student, List<IntegrityCase> cases) {
        RepeatOffenderRecord record = new RepeatOffenderRecord();
        record.setStudentProfile(student);
        record.setTotalCases(cases.size());

        if (cases.size() >= 4) {
            record.setFlagSeverity("HIGH");
        } else if (cases.size() >= 2) {
            record.setFlagSeverity("MEDIUM");
        } else {
            record.setFlagSeverity("LOW");
        }

        return record;
    }
}
