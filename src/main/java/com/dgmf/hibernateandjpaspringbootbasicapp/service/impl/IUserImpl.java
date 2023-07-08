package com.dgmf.hibernateandjpaspringbootbasicapp.service.impl;

import com.dgmf.hibernateandjpaspringbootbasicapp.entity.User;
import com.dgmf.hibernateandjpaspringbootbasicapp.repository.UserRepository;
import com.dgmf.hibernateandjpaspringbootbasicapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
