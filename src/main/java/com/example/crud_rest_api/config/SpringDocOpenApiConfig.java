package com.example.crud_rest_api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocOpenApiConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()

                .info(
                        new Info()
                                .title("API REST - CRUD")
                                .description("API for users control")
                                .version("1.0")

                );
    }


}
