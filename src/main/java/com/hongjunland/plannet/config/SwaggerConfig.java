package com.hongjunland.plannet.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI(){
//        Info info = new Info();
        return new OpenAPI().components(new Components());
    }
}
