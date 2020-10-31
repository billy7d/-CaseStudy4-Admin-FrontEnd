package com.example.testFE.service;

import com.example.testFE.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface AppUserService {

    Iterable<AppUser> findAll();

    AppUser save(AppUser user);

    Optional<AppUser> findOne(Long id);

    void remove(Long id);
}
