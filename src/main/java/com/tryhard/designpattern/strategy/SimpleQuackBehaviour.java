package com.tryhard.designpattern.strategy;

public class SimpleQuackBehaviour implements IQuackBehaviour {

    public void quack(String name) {
        System.out.println("Simple quack is :: " +  name);
    }
}
