package com.example.demo.service.impl;

import com.example.demo.repository.PenaltyActionRepository;
import com.example.demo.service.PenaltyActionService;
import org.springframework.stereotype.Service;

@Service
public class PenaltyActionServiceImpl implements PenaltyActionService {

    private final PenaltyActionRepository penaltyActionRepository;

    public PenaltyActionServiceImpl(PenaltyActionRepository penaltyActionRepository) {
        this.penaltyActionRepository = penaltyActionRepository;
    }
}
