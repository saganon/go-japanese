package com.saga.gojapanese.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/languages")
public class LanguagesController {

    @GetMapping("/ping")
    public String languages() {
        return "ping";
    }
}
