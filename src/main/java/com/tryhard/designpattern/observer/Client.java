package com.tryhard.designpattern.observer;

public class Client {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        PhoneObserver phoneObserver = new PhoneObserver(weatherStation);
        weatherStation.add(phoneObserver);

        WindowObserver windowObserver = new WindowObserver(weatherStation);
        weatherStation.add(windowObserver);

        weatherStation.setTemperature(100);
        System.out.println("+++++++++++++++++++++++++");
        weatherStation.setTemperature(101);
    }
}
