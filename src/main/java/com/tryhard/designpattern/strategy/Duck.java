package com.tryhard.designpattern.strategy;

public class Duck {
    private String name;
    private String gender;

    private IQuackBehaviour iQuackBehaviour;
    private IDisplayBehaviour iDisplayBehaviour;

    public Duck(String name, String gender, IQuackBehaviour iQuackBehaviour, IDisplayBehaviour iDisplayBehaviour) {
        this.name = name;
        this.gender = gender;
        this.iQuackBehaviour = iQuackBehaviour;
        this.iDisplayBehaviour = iDisplayBehaviour;
    }

    public void quack() {
        this.iQuackBehaviour.quack(this.name);
    }

    public void display() {
        this.iDisplayBehaviour.display(this.name, this.gender);
    }

}
