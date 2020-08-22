package com.tryhard.designpattern.factorymethod;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}
