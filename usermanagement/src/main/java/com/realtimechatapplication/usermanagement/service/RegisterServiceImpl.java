package com.realtimechatapplication.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realtimechatapplication.usermanagement.bean.User;
import com.realtimechatapplication.usermanagement.repository.UserRepository;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired(required = true)
    private UserRepository userRepo;

    @Override
    public void registerUser(User user) {
        User newUser = new User(user.getUsername(), user.getPassword());
       userRepo.save(newUser);
    }

    
    
}
