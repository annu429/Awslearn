package com.anand.aws_learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AwsDemoPipeline {

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }
}
