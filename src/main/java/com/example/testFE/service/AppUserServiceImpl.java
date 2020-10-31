package com.example.testFE.service;

import com.example.testFE.model.AppUser;
import com.example.testFE.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserServiceImpl implements  AppUserService{

    @Autowired
    AppUserRepo appUserRepo;

    @Override
    public Iterable<AppUser> findAll() {
        Iterable<AppUser> appUsers = appUserRepo.findAll();
        return appUsers;
    }

    @Override
    public AppUser save(AppUser user) {
        appUserRepo.save(user);
        return user;
    }

    @Override
    public Optional<AppUser> findOne(Long id) {
        return appUserRepo.findById(id);
    }

    @Override
    public void remove(Long id) {
        appUserRepo.deleteById(id);
    }
}
