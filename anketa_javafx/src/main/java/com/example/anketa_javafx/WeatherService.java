package com.example.anketa_javafx;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public String getWeatherForecast() {
        return "It's gonna snow a lot. Brace yourselves, the winter is coming.";
    }
}
