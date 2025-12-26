package com.example.demo.util;

import com.example.demo.entity.IntegrityCase;

import java.time.LocalDateTime;
import java.util.List;

public class RepeatOffenderCalculator {

    public static boolean isRepeatOffender(List<IntegrityCase> cases) {
        if (cases == null || cases.size() < 2) {
            return false;
        }

        cases.sort((c1, c2) -> {
            LocalDateTime d1 = c1.getIncidentDate();
            LocalDateTime d2 = c2.getIncidentDate();

            if (d1 == null && d2 == null) return 0;
            if (d1 == null) return -1;
            if (d2 == null) return 1;

            return d1.compareTo(d2);
        });

        return true;
    }
}
