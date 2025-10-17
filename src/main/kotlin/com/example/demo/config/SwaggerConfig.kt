package com.example.demo.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    @ConditionalOnProperty(name = ["swagger.enabled"], havingValue = "true", matchIfMissing = false)
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Demo API")
                    .description("Spring Boot REST API with Swagger and JWT")
                    .version("1.0")
            )
    }
}
