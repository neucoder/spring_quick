package com.ys;

import com.ys.dao.BookDao;
import com.ys.dao.impl.BookDaoImpl;
import com.ys.service.BookService;
import com.ys.service.impl.BookServiceImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

    }
}
