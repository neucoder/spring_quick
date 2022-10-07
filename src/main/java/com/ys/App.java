package com.ys;

import com.ys.config.SpringConfig;
import com.ys.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = (BookDao) ctx.getBean("bookDaoImpl");

        bookDao.save();
        bookDao.update();
        bookDao.select();
        bookDao.delete();
    }
}
