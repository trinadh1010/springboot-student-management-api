package com.trinadh.studentManagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String welcome(){
        return "Hello welcome to student management";
    }
}
