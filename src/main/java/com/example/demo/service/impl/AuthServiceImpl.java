package com.example.demo.service.impl;

import com.example.demo.dto.JwtResponse;
import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.AuthService;

public class AuthServiceImpl implements AuthService {

    private final AppUserRepository appUserRepository;

    public AuthServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public JwtResponse login(LoginRequest loginRequest) {
        AppUser user = appUserRepository.findByEmail(loginRequest.getEmail()).orElseThrow();
        return new JwtResponse("TOKEN", user.getId(), user.getEmail(), "ROLE");
    }

    public void register(RegisterRequest registerRequest) {
        if (appUserRepository.existsByEmail(registerRequest.getEmail())) {
            throw new IllegalArgumentException();
        }
        AppUser user = new AppUser();
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        appUserRepository.save(user);
    }
}
