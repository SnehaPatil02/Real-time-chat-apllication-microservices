package com.realtimechatapplication.usermanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtimechatapplication.datapackage.bean.User;
import com.realtimechatapplication.usermanagement.service.RegisterService;

@RestController
@RequestMapping("/usermanagement")
public class LoginController {

    @Autowired(required=true)
    private RegisterService registerService;
    
    @PostMapping("/login")
   public ResponseEntity<String> userLogin(@RequestBody User user) {
        // Here, you just receive the user's data. No database interaction is performed.

        String response = "Received user data: Username - " + user.getUsername() + 
                          ", Password - " + user.getPassword();
        
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public String userRegister(@RequestBody User user){
        registerService.registerUser(user);
        return "Registered successfully";
    }



}
