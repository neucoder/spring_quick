package com.ys.service.impl;

import com.ys.dao.BookDao;
import com.ys.dao.impl.BookDaoImpl;
import com.ys.service.BookService;

public class BookServiceImpl implements BookService {
    BookDao bookDao;
    @Override
    public void save() {

        System.out.println("bookservice save----------");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
