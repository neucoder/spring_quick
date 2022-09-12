package com.ys.dao.impl;

import com.ys.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void init(){
        System.out.println("init method run...");
    }
    public void destroy(){
        System.out.println("destroy method run...");
    }
    @Override
    public void save(){
        System.out.println("book dao save-----");
    }
}
