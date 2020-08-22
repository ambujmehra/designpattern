package com.tryhard.designpattern.factorymethod;

public class Client {
    public static void main(String[] args) {
        RandomAnimalFactory randomAnimalFactory = new RandomAnimalFactory();
        Animal animal = randomAnimalFactory.createAnimal(3);

        animal.display();
        animal.speak();
    }
}
