package com.contact.scoring.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record ScoreMessage(
        @JsonProperty("phone_number")
        String phoneNumber,
        @JsonProperty("score")
        int score
) {

}
