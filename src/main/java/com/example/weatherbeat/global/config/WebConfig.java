package com.example.weatherbeat.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName      : WeatherBeat
 * fileName         : WebConfig
 * author           : 박수진
 * date             : 2026-02-05
 * description      :
 * =========================================================
 * DATE               AUTHOR            NOTE
 * ---------------------------------------------------------
 * 2026-02-05           박수진           최초생성
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")                               // 모든 경로에 대해
                .allowedOrigins("http://localhost:5173")                   // React(Vite) 개발 서버 주소
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // OPTIONS 추가 권장
                .allowedHeaders("*")                                       // 모든 헤더 허용
                .allowCredentials(true)                                    // 쿠키/인증 세션 사용 시 필수
                .maxAge(3600);                                             // Preflight 요청 캐싱 시간 (초 단위)
    }
}