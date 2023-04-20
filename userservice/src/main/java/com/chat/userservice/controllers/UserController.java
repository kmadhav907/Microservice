package com.chat.userservice.controllers;

import com.chat.userservice.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user" )
public class UserController {

    @GetMapping(value = "/")
    public ResponseEntity<ResponseDto> getServiceName(){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setName("madhav");
        responseDto.setAge("23");
        return ResponseEntity.ok(responseDto);
    }
}
