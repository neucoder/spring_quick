package com.ys.dao.impl;

import com.ys.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save(){
        System.out.println("book dao save-----");
    }
}
