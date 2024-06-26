package com.emotionoui.oui.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해 CORS 허용
                .allowedOrigins("http://localhost:3000", "http://j10a506.p.ssafy.io", "https://j10a506.p.ssafy.io")
                .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS", "HEAD", "PATCH")
                .exposedHeaders("Authorization", "RefreshToken", "Content-Type")
                .allowCredentials(true); // 인증 정보 허용 설정
    }
}