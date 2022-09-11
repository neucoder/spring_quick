package com.ys;

import com.ys.service.BookService;
import com.ys.service.impl.BookServiceImpl;

public class test {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
        System.out.println("test");
    }
}
