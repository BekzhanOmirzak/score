package com.contact.scoring.service.impl;

import com.contact.scoring.model.ScoreMessage;
import com.contact.scoring.service.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreServiceImpl implements ScoreService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void increaseScore() {
        kafkaTemplate.send(
                "user_score",
                ScoreMessage.builder().phoneNumber("+77763655665").score(10).build()
        );
    }

}
