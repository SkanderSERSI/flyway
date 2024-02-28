package com.sfeir.flyway;

import com.sfeir.flyway.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

@SpringBootApplication
@RequiredArgsConstructor
public class FlywayApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlywayApplication.class, args);
    }
}
