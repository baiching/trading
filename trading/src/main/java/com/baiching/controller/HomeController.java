package com.baiching.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping
    public @ResponseBody String home() {
        //logger.info("Home endpoint called");
        return "welcome to trading platform";
    }

    @GetMapping("/api")
    public String secure() {
        return "welcome to trading platform secure";
    }
}
