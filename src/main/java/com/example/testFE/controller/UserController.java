package com.example.testFE.controller;

import com.example.testFE.model.AppUser;
import com.example.testFE.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("")
    public String showAllUsers(Model model){
        Iterable<AppUser> users = appUserService.findAll();
        model.addAttribute("users",users);
        return "home";
    }

}
