package com.tryhard.designpattern.decorator;

public class Espresso extends Beverage {
    @Override
    String desc() {
        return "This is a espresso";
    }

    @Override
    Integer cost() {
        return 2;
    }
}
