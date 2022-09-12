package com.ys.service.impl;

import com.ys.dao.BookDao;
import com.ys.dao.impl.BookDaoImpl;
import com.ys.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    BookDao bookDao;
    @Override
    public void save() {

        System.out.println("bookservice save----------");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set property");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy service");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init service");
    }
}
