package com.example.demo.service.impl;

import com.example.demo.entity.PenaltyAction;
import com.example.demo.repository.PenaltyActionRepository;
import com.example.demo.service.PenaltyActionService;
import java.util.List;

public class PenaltyActionServiceImpl implements PenaltyActionService {

    private final PenaltyActionRepository repository;

    public PenaltyActionServiceImpl(PenaltyActionRepository repository) {
        this.repository = repository;
    }

    public PenaltyAction addPenalty(PenaltyAction p) {
        return repository.save(p);
    }

    public PenaltyAction getPenaltyById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<PenaltyAction> getAllPenalties() {
        return repository.findAll();
    }
}
