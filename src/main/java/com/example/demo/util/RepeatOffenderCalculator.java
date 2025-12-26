package com.example.demo.util;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.entity.StudentProfile;

import java.time.LocalDate;
import java.util.List;

public class RepeatOffenderCalculator {

    public boolean isRepeatOffender(StudentProfile profile, List<IntegrityCase> cases) {
        LocalDate now = LocalDate.now();

        long recentCases = cases.stream()
                .filter(c -> c.getIncidentDate() != null)
                .filter(c -> c.getIncidentDate().isAfter(now.minusMonths(6)))
                .count();

        return recentCases >= 2;
    }
}
