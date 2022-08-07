package com.saga.gojapanese.controllers;

import com.saga.gojapanese.models.LanguagesModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/languages")
public class GoJapaneseController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/all")
    public LanguagesModel languages() {
        return new LanguagesModel(counter.incrementAndGet(), "mizu");
    }
}
