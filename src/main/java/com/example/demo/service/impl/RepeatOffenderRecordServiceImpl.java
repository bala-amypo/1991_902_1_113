package com.example.demo.service.impl;

import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.service.RepeatOffenderRecordService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    @Override
    public void refreshRepeatOffenderData(Long studentId) {
    }

    @Override
    public RepeatOffenderRecord getRecordByStudent(Long studentId) {
        return null;
    }

    @Override
    public List<RepeatOffenderRecord> getAllRepeatOffenders() {
        return List.of();
    }
}
