package com.tryhard.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Iobservable {

    List<Iobserver> iobservers;

    Integer temperature;

    public WeatherStation() {
        this.iobservers = new ArrayList<>();
        this.temperature = 98;
    }
    @Override
    public void add(Iobserver iobserver) {
        iobservers.add(iobserver);
    }

    @Override
    public void remove(Iobserver iobserver) {
        iobservers.remove(iobserver);
    }

    @Override
    public void notifyObservers() {
        for (Iobserver iobserver:iobservers) {
            iobserver.update();
        }
    }


    public Integer getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
