package com.esercizioRecapSpringSecondaSettimana.esercizioRecapSpringSecondaSettimana.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenAPIConfig {


    @Bean
    public OpenAPI myOpenAPI() {

        Info info = new Info()
                .title("LIBRERIA")
                .version("1.0")
                .description("una semplice libreria")
                .contact(new Contact().name("Antonio Taminto").email("taminto.a@gmail.com"));

        return new OpenAPI().info(info);
    }
}