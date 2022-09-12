package com.ys.dao.impl;

import com.ys.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String databaseName;
    private int connectionNum;


    public void save() {
        System.out.println("book dao save ...");
    }
}
