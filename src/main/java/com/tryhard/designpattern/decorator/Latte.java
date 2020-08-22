package com.tryhard.designpattern.decorator;

public class Latte extends Beverage {
    @Override
    String desc() {
        return "This is a Latte";
    }

    @Override
    Integer cost() {
        return 2;
    }
}
