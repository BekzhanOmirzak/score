package com.contact.scoring.controller;


import com.contact.scoring.model.request.AddUserScore;
import com.contact.scoring.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ScoreController {

    private final ScoreService scoreService;

    @PostMapping("/open-account")
    public void openAccountWithInitialScore(
            @RequestParam("user_id") String userId
    ) {
        scoreService.openAccountWithInitialScore(userId);
    }

    @GetMapping("/add-score")
    public void addScoreToUser(
            @RequestHeader(name = "Authorization") String token,
            @RequestBody AddUserScore addUserScore
    ) {
        scoreService.addScoreToUser(token, addUserScore);
    }

}
