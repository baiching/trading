package com.baiching.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "welcome to trading platform";
    }

    @GetMapping("/api")
    public String secure() {
        return "welcome to trading platform secure";
    }
}
