package com.tryhard.designpattern.decorator;

public class Client {

    public static void main(String[] args) {
        Beverage caramelEspresso = new Caramel(new Espresso());

        Beverage chocolateLatte = new Chocolate(new Latte());

        System.out.println(caramelEspresso.desc());
        System.out.println(caramelEspresso.cost());
        System.out.println("+++++++++++++++++");
        System.out.println(chocolateLatte.desc());
        System.out.println(chocolateLatte.cost());
    }
}
