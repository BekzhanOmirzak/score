package com.contact.scoring.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_score")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreUser {

    @Id
    private String user_id;

    @Column(name = "score")
    private int score;

}
