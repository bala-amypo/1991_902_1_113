package com.example.demo.util;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.entity.StudentProfile;
import java.time.LocalDate;
import java.util.List;

public class RepeatOffenderCalculator {

    public RepeatOffenderRecord computeRepeatOffenderRecord(
            StudentProfile student,
            List<IntegrityCase> cases) {

        RepeatOffenderRecord record = new RepeatOffenderRecord();
        record.setStudentProfile(student);
        record.setTotalCases(cases.size());

        LocalDate lastDate = cases.stream()
                .map(IntegrityCase::getIncidentDate)
                .max(LocalDate::compareTo)
                .orElse(null);

        record.setLastIncidentDate(lastDate);

        if (cases.size() == 1) {
            record.setFlagSeverity("LOW");
        } else if (cases.size() == 2) {
            record.setFlagSeverity("MEDIUM");
        } else {
            record.setFlagSeverity("HIGH");
        }

        return record;
    }
}
