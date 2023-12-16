package com.realtimechatapplication.usermanagement.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtimechatapplication.usermanagement.bean.User;

@RestController
@RequestMapping("/usermanagement")
public class LoginController {
    
    @PostMapping("/login")
   public ResponseEntity<String> userLogin(@RequestBody User user) {
        // Here, you just receive the user's data. No database interaction is performed.

        String response = "Received user data: Username - " + user.getUsername() + 
                          ", Password - " + user.getPassword();
        
        return ResponseEntity.ok(response);
}
}
