package com.tryhard.designpattern.factorymethod;

public class RandomAnimalFactory implements IAnimalFactory {

    @Override
    public Animal createAnimal(int val) {
        if (val == 1)
            return new Dog("tobby");
        else
            return new Cat("dodo");
    }
}
