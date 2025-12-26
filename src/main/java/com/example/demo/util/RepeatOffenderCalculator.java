package com.example.demo.util;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.RepeatOffenderRecord;
import java.util.List;

public class RepeatOffenderCalculator {

    public RepeatOffenderRecord calculate(List<IntegrityCase> cases) {
        RepeatOffenderRecord record = new RepeatOffenderRecord();
        record.setTotalCases(cases.size());
        record.setFlagSeverity(cases.size() > 2 ? "HIGH" : "LOW");
        return record;
    }
}
