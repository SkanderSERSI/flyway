package com.sfeir.flyway;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class FlywayApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlywayApplication.class, args);
    }
}
