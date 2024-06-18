package com.contact.scoring.service;

import com.contact.scoring.model.request.AddUserScore;

public interface ScoreService {

    void openAccountWithInitialScore(String userId);

    void addScoreToUser(String token, AddUserScore addUserScore);

}
