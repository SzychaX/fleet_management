package com.example.fleet_management.Config;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springdoc-public-api")
                .pathsToMatch("/api/**")  // Dostosuj ścieżki do swojego API
                .build();
    }
}

