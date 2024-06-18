package com.contact.scoring.service.impl;

import com.contact.scoring.model.entity.ScoreUser;
import com.contact.scoring.model.request.AddUserScore;
import com.contact.scoring.repository.ScoreUserRepository;
import com.contact.scoring.service.ScoreService;
import com.contact.scoring.utils.JwtUtill;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScoreServiceImpl implements ScoreService {

    private final ScoreUserRepository scoreUserRepository;
    private final JwtUtill jwtUtill;

    @Override
    public void openAccountWithInitialScore(String userId) {
        var userScore = ScoreUser.builder().user_id(userId).score(100).build();
        scoreUserRepository.save(userScore);
    }

    @Override
    @Transactional
    public void addScoreToUser(String token, AddUserScore addUserScore) {
        var userId = jwtUtill.getUserId(token);
        var userScore = scoreUserRepository.getScoreUserByUserId(userId)
                .orElseThrow(() -> new UsernameNotFoundException("User by user id " + userId + " not found"));
        userScore.setScore(userScore.getScore() + addUserScore.score());
    }

}
