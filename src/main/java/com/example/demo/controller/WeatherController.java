package com.example.demo.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.DailyWeather;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @GetMapping("/daily")
    public ResponseEntity<DailyWeather> getDailyWeather() {
        DailyWeather dailyWeather = new DailyWeather("Monday", 27.2, "Partly Sunny");
        return ResponseEntity.ok(dailyWeather);
    }
}
