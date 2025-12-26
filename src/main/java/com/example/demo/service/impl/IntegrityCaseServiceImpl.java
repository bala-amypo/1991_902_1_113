package com.example.demo.service.impl;

import com.example.demo.repository.IntegrityCaseRepository;
import com.example.demo.service.IntegrityCaseService;
import org.springframework.stereotype.Service;

@Service
public class IntegrityCaseServiceImpl implements IntegrityCaseService {

    private final IntegrityCaseRepository integrityCaseRepository;

    public IntegrityCaseServiceImpl(IntegrityCaseRepository integrityCaseRepository) {
        this.integrityCaseRepository = integrityCaseRepository;
    }
}
