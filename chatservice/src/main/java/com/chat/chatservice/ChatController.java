package com.chat.chatservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value =  "/chat")
public class ChatController {
    @GetMapping(value = "/")
    public String getServiceName(){
        return "CHAT_SERVICE";
    }
}
