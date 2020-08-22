package com.tryhard.designpattern.factorymethod;

public abstract class Animal {
    String name;

    public void display() {
        System.out.println("My name is :: " + this.name);
    }
    public abstract void speak();
}
