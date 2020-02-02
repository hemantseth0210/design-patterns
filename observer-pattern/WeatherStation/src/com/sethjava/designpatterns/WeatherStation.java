package com.sethjava.designpatterns;

import com.sethjava.designpatterns.observers.CurrentConditionsDisplay;
import com.sethjava.designpatterns.observers.LEDDisplay;
import com.sethjava.designpatterns.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        LEDDisplay ledDisplay = new LEDDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
