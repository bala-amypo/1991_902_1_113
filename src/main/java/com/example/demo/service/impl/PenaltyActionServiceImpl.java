package com.example.demo.service.impl;

import com.example.demo.entity.PenaltyAction;
import com.example.demo.repository.PenaltyActionRepository;
import com.example.demo.service.PenaltyActionService;

import java.util.List;

public class PenaltyActionServiceImpl implements PenaltyActionService {

    private final PenaltyActionRepository penaltyActionRepository;

    public PenaltyActionServiceImpl(PenaltyActionRepository penaltyActionRepository) {
        this.penaltyActionRepository = penaltyActionRepository;
    }

    public PenaltyAction addPenalty(PenaltyAction penaltyAction) {
        return penaltyActionRepository.save(penaltyAction);
    }

    public PenaltyAction getPenaltyById(Long id) {
        return penaltyActionRepository.findById(id).orElseThrow();
    }

    public List<PenaltyAction> getAllPenalties() {
        return penaltyActionRepository.findAll();
    }
}
