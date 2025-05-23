package com.cheng.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index() {
        String body="Welcome to the Core Banking!!!";
        return new ResponseEntity<>(body, HttpStatus.OK).getBody();
    }
}
