package com.tofhdnsakdmatotlwkr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncryptService {

    private PasswordEncoder passwordEncoder;

    @Autowired
    public EncryptService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public String passEncode(String password) {
        return passwordEncoder.encode(password);
    }

}
