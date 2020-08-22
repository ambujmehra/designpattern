package com.tryhard.designpattern.strategy;

public class NoQuackBehaviour implements IQuackBehaviour {
    public void quack(String name) {
        System.out.println("No QUACK");
    }
}
