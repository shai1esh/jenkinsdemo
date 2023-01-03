package com.svs.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("jenkins")
@RestController
public class JenkinsController {

    @GetMapping("/print")
    public String printHello(){
        String hello = "Hello Jenkins";
        System.out.println(hello);
        return hello;
    }
}
