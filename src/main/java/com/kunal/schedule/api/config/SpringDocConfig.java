package com.kunal.schedule.api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
@OpenAPIDefinition
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(customInfo());
    }

    // TODO, read version from build.gradle file and display on swagger doc
    private Info customInfo() {
        // version from version.properties
        String version = "1";
//        try {
//            InputStream stream = ClassLoader.getSystemResourceAsStream("version.properties");
//            Properties p = new Properties();
//            p.load(stream);
//            version = p.getProperty("version");
//        } catch (IOException e) {
//             do nothing
//        }

        return new Info()
                .title("Just a practice application")
                .version(version);
    }

}
