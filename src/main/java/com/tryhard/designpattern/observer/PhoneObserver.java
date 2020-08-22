package com.tryhard.designpattern.observer;

public class PhoneObserver implements Iobserver,IDisplay {

    private WeatherStation weatherStation;

    public PhoneObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
    public void display(String message) {
        System.out.println("Phone display is :: " + message);
    }

    @Override
    public void update() {
        this.display(weatherStation.getTemperature().toString());
    }
}
