package com.nikhil.MyFirstWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greeting(){
        return "Welcome to the home page";
    }
    @RequestMapping("/about")
    public String about(){
        return "this is just a demo app";
    }
}
