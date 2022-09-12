package com.ys;

import com.ys.dao.BookDao;
import com.ys.service.BookService;
import com.ys.service.impl.BookServiceImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
        System.out.println("test");
    }
}
