package com.example.demo.service;

import com.example.demo.entity.PenaltyAction;
import org.springframework.stereotype.Service;   

import java.util.List;

@Service
public class PenaltyActionService {

    public PenaltyAction addPenalty(PenaltyAction p) {
        return p;
    }

    public PenaltyAction getPenaltyById(Long id) {
        return null;
    }

    public List<PenaltyAction> getAllPenalties() {
        return List.of();
    }
}
