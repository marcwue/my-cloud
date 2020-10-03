package com.example.temperatureservice.model;

public class Temperature {

    private final int celsius;

    public Temperature(int celsius) {
        this.celsius = celsius;
    }

    public int getCelsius() {
        return celsius;
    }
}
