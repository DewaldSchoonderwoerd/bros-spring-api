package com.bros.datacollector.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class ControllerTest {


    @GetMapping
    public String message(){
        return "Success!!!";
    }

}
