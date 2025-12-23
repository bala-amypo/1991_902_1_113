package com.example.demo.service.impl;

import com.example.demo.entity.RepeatOffenderRecord;
import com.example.demo.service.RepeatOffenderRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepeatOffenderRecordServiceImpl implements RepeatOffenderRecordService {

    @Override
    public RepeatOffenderRecord addRecord(RepeatOffenderRecord record) {
        return record;
    }

    @Override
    public RepeatOffenderRecord getRecordById(Long id) {
        return null;
    }

    @Override
    public List<RepeatOffenderRecord> getAllRecords() {
        return List.of();
    }
}
