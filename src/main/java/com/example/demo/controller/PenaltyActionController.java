package com.example.demo.controller;

import com.example.demo.entity.PenaltyAction;
import com.example.demo.service.PenaltyActionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/penalties")
public class PenaltyActionController {

    private final PenaltyActionService service;

    public PenaltyActionController(PenaltyActionService service) {
        this.service = service;
    }

    @PostMapping
    public PenaltyAction add(@RequestBody PenaltyAction p) {
        return service.addPenalty(p);
    }

    @GetMapping("/{id}")
    public PenaltyAction byId(@PathVariable Long id) {
        return service.getPenaltyById(id);
    }

    @GetMapping
    public List<PenaltyAction> all() {
        return service.getAllPenalties();
    }
}
