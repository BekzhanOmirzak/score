package com.contact.scoring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication
public class ScoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoringApplication.class, args);
    }

}
