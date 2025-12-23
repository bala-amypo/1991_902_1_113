package com.example.demo.service.impl;

import com.example.demo.entity.PenaltyAction;
import com.example.demo.service.PenaltyActionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PenaltyActionServiceImpl implements PenaltyActionService {

    @Override
    public PenaltyAction addPenalty(PenaltyAction p) {
        return p;
    }

    @Override
    public PenaltyAction getPenaltyById(Long id) {
        return null;
    }

    @Override
    public List<PenaltyAction> getAllPenalties() {
        return List.of();
    }
}
