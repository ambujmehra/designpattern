package com.tryhard.designpattern.strategy;

public class SImpleDisplayBehaviour implements IDisplayBehaviour {
    public void display(String name, String gender) {
        System.out.println("I am " + name + " also my gender is " + gender);
    }
}
