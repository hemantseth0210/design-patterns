package com.sethjava.designpatterns.observers;

import com.sethjava.designpatterns.subject.Subject;

public class LEDDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public LEDDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("LED Display conditions: " + temperature
                + "F degrees and " + humidity + "% humidity " + pressure + " pascal" );
    }
}
