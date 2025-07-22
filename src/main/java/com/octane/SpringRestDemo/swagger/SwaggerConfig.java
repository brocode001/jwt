package com.octane.SpringRestDemo.swagger;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;


@Configuration
@OpenAPIDefinition(
    info = @Info(
    title = "Spring Rest Demo API",
    version = "Version 1.0",
    contact = @Contact(
        name = "Octane Team",
        email = "venkatsuyraps@gmail.com",
        url = "http://www.youtube.com"
    ),
    license = @License(
        name = "Apache 2.0",
        url = "http://www.apache.org/licenses/LICENSE-2.0"
    ),
    termsOfService = "http://www.youtube.com",
    description = "API documentation for the Spring Rest Demo application"
    )
)
public class SwaggerConfig {
}