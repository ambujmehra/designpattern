package com.tryhard.designpattern.strategy;

public class Client {

    public static void main(String[] args) {
        IQuackBehaviour simpleQuack = new SimpleQuackBehaviour();
        IQuackBehaviour noQuack = new NoQuackBehaviour();
        IDisplayBehaviour simpleDisplay = new SImpleDisplayBehaviour();

        Duck cityDuck = new Duck("ducky","female", simpleQuack, simpleDisplay);
        cityDuck.display();
        cityDuck.quack();
        System.out.println("==========================");

        Duck wildDuck = new Duck("ducky2","male", noQuack, simpleDisplay);
        wildDuck.display();
        wildDuck.quack();
    }
}
