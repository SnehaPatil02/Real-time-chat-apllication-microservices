package com.realtimechatapplication.messagingservice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messagingservice")
public class MessageController {
    

    @PostMapping("/sendMessage")
    public String sendMessage(){
        
        return "message is sent";
    }
}
