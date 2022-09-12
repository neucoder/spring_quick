package com.ys.service.impl;

import com.ys.dao.BookDao;
import com.ys.dao.UserDao;
import com.ys.dao.impl.BookDaoImpl;
import com.ys.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    @Override
    public void save() {
        System.out.println("bookservice save----------");
        bookDao.save();
    }
}
