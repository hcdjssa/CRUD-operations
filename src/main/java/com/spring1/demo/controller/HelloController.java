package com.spring1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */

 @RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello worlddd!";
    }
}