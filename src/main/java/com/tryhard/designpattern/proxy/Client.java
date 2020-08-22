package com.tryhard.designpattern.proxy;

public class Client {

    public static void main(String[] args) {

        String book = "ABCDEF";

        LazyBookParserProxy lazyBookParserProxy = new LazyBookParserProxy(book);
        System.out.println("++++++++++++++++++++++");
        System.out.println(lazyBookParserProxy.getNumberOfPager());
        System.out.println("--------------------");
        System.out.println(lazyBookParserProxy.getNumberOfPager());
    }
}
