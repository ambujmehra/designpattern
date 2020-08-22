package com.tryhard.designpattern.adaptor;

public class Client {

    public static void main(String[] args) {

        IAsiaCharger iAsiaCharger = new AsiaToEuroAdaptor(new GermanyCharger());
        System.out.println(iAsiaCharger.getPower(null));
    }
}
