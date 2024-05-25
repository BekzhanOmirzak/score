package com.contact.scoring.controller;


import com.contact.scoring.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ScoreController {

    private final ScoreService scoreService;

    @GetMapping("/increase")
    public void increase() {
        scoreService.increaseScore();
    }

}
