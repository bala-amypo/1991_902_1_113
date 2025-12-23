package com.example.demo.service;

import com.example.demo.entity.PenaltyAction;
import java.util.List;
@Service
public interface PenaltyActionService {
    PenaltyAction addPenalty(PenaltyAction penalty);
    PenaltyAction getPenaltyById(Long id);
    List<PenaltyAction> getAllPenalties();
}
