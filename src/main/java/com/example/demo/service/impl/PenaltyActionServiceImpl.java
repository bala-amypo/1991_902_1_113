package com.example.demo.service.impl;

import com.example.demo.entity.PenaltyAction;
import com.example.demo.repository.PenaltyActionRepository;
import com.example.demo.service.PenaltyActionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PenaltyActionServiceImpl implements PenaltyActionService {

    private final PenaltyActionRepository repository;

    public PenaltyActionServiceImpl(PenaltyActionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PenaltyAction> getAllPenalties() {
        return repository.findAll();
    }

    @Override
    public PenaltyAction getPenaltyById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public PenaltyAction addPenalty(PenaltyAction penaltyAction) {
        return repository.save(penaltyAction);
    }
}
