package com.tryhard.designpattern.observer;

public class WindowObserver implements Iobserver,IDisplay {
    private WeatherStation weatherStation;

    public WindowObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
    public void display(String message) {
        System.out.println("Window display is :: " + message);
    }

    @Override
    public void update() {
        this.display(weatherStation.getTemperature().toString());
    }
}
