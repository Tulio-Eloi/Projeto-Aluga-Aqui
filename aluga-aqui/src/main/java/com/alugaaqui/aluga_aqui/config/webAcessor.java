package com.alugaaqui.aluga_aqui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class webAcessor implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry cors){
        cors.addMapping("/**")
        .allowedOrigins("http://localhost:5173") // URL do seu frontend
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
        .allowCredentials(true);
        
    }
}
