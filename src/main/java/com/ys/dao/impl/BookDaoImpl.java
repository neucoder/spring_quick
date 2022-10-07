package com.ys.dao.impl;

import com.ys.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save(){
        System.out.println("book dao save-----");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void select() {

    }
}
