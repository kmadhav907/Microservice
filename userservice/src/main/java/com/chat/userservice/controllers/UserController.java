package com.chat.userservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user" )
public class UserController {

    @GetMapping(value = "/")
    public String getServiceName(){
        return "USER_SERVICE";
    }
}
