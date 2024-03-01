package com.sfeir.flyway.infrastructure.migration.config;

import com.sfeir.flyway.infrastructure.migration.FlywayCallback;
import org.springframework.boot.autoconfigure.flyway.FlywayConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {

    @Bean
    public FlywayConfigurationCustomizer flywayConfigurationCustomizer() {
        return configuration -> configuration.callbacks(new FlywayCallback());
    }
}
