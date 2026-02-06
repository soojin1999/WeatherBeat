package com.example.weatherbeat.domain.test.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName      : WeatherBeat
 * fileName         : TestController
 * author           : 박수진
 * date             : 2026-02-05
 * description      :
 * =========================================================
 * DATE               AUTHOR            NOTE
 * ---------------------------------------------------------
 * 2026-02-05           박수진           최초생성
 */
@RestController
public class TestController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, WeatherBeat!";
    }
}