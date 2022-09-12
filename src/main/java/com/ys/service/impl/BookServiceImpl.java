package com.ys.service.impl;

import com.ys.dao.BookDao;
import com.ys.dao.UserDao;
import com.ys.dao.impl.BookDaoImpl;
import com.ys.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao){
        this.bookDao = bookDao;
        this.userDao = userDao;
    }


    @Override
    public void save() {

        System.out.println("bookservice save----------");
        bookDao.save();
        userDao.save();
    }

}
