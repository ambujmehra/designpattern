package com.tryhard.designpattern.observer;

public interface Iobservable {

    void add (Iobserver iobserver);

    void remove(Iobserver iobserver);

    void notifyObservers();
}
