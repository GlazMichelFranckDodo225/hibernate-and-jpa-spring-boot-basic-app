package com.dgmf.hibernateandjpaspringbootbasicapp.controller;

import com.dgmf.hibernateandjpaspringbootbasicapp.entity.User;
import com.dgmf.hibernateandjpaspringbootbasicapp.repository.UserRepository;
import com.dgmf.hibernateandjpaspringbootbasicapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
