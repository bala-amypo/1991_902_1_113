package com.example.demo.util;

import java.util.List;
import com.example.demo.entity.*;

public class RepeatOffenderCalculator {

    public RepeatOffenderRecord computeRepeatOffenderRecord(StudentProfile profile, List<IntegrityCase> cases) {
        RepeatOffenderRecord record = new RepeatOffenderRecord();
        record.setStudentProfile(profile);
        record.setTotalCases(cases.size());
        record.setFlagSeverity(cases.size() >= 3 ? "HIGH" : "LOW");
        return record;
    }
}
