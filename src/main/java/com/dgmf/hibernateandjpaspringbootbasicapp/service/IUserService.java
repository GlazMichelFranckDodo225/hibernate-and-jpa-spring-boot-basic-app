package com.dgmf.hibernateandjpaspringbootbasicapp.service;

import com.dgmf.hibernateandjpaspringbootbasicapp.entity.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);

    List<User> getAllUsers();
}
