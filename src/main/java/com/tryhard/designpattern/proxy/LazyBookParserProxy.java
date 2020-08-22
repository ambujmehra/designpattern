package com.tryhard.designpattern.proxy;

public class LazyBookParserProxy implements IBookParser {

    private String book;
    private BookParser bookParser;
    public LazyBookParserProxy(String book) {
        this.book = book;
        this.bookParser = null;
    }

    @Override
    public int getNumberOfPager() {
        if (bookParser == null) {
            try {
                this.bookParser = new BookParser(this.book);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return this.bookParser.getNumberOfPager();
    }
}
