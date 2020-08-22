package com.tryhard.designpattern.proxy;

public class BookParser implements IBookParser {

    private String book;
    public BookParser(String book) throws InterruptedException {
        this.book = book;
        // expensive operation
        Thread.sleep(4000);
    }
    @Override
    public int getNumberOfPager() {
        return book.length();
    }
}
