package com.example.demo.controller;

import com.example.demo.entity.IntegrityCase;
import com.example.demo.service.IntegrityCaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cases")
public class IntegrityCaseController {
    private final IntegrityCaseService integrityCaseService;

    public IntegrityCaseController(IntegrityCaseService integrityCaseService) {
        this.integrityCaseService = integrityCaseService;
    }

    @PostMapping
    public ResponseEntity<IntegrityCase> createCase(@RequestBody IntegrityCase integrityCase) {
        return ResponseEntity.ok(integrityCaseService.createCase(integrityCase));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<IntegrityCase> updateCaseStatus(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(integrityCaseService.updateCaseStatus(id, status));
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<IntegrityCase>> getCasesByStudent(@PathVariable Long studentId) {
        return ResponseEntity.ok(integrityCaseService.getCasesByStudent(studentId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<IntegrityCase> getCaseById(@PathVariable Long id) {
        Optional<IntegrityCase> caseOpt = integrityCaseService.getCaseById(id);
        return caseOpt.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}