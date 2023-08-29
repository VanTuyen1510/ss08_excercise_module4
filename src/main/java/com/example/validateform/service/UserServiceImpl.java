package com.example.validateform.service;

import com.example.validateform.entity.User;
import com.example.validateform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repository;

    @Override
    public void save(User user) {
        repository.save(user);
    }
}
