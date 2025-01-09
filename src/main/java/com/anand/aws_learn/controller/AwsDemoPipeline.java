package com.anand.aws_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class AwsDemoPipeline {

    @GetMapping
    public String getMessage(){
        return "Aws Demo pipeline Demo";
    }
}
