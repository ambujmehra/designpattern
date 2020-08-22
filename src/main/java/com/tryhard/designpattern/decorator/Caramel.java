package com.tryhard.designpattern.decorator;

public class Caramel extends AddOnDecorator {

    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    String desc() {
        return this.beverage.desc() + " Adding caramel";
    }

    @Override
    Integer cost() {
        return this.beverage.cost()+2;
    }
}
