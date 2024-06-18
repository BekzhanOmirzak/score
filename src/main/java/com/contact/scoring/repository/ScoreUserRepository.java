package com.contact.scoring.repository;

import com.contact.scoring.model.entity.ScoreUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ScoreUserRepository extends JpaRepository<ScoreUser, String> {

    @Query(value = "SELECT * FROM user_score WHERE user_id = :user_id", nativeQuery = true)
    Optional<ScoreUser> getScoreUserByUserId(@Param("user_id") String userId);

}
