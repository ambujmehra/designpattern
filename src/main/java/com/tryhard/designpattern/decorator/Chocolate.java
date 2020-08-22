package com.tryhard.designpattern.decorator;

public class Chocolate extends AddOnDecorator {
    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    String desc() {
        return this.beverage.desc() + " Adding chocolate";
    }

    @Override
    Integer cost() {
        return this.beverage.cost()+3;
    }
}
