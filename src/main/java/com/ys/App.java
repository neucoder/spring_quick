package com.ys;

import com.ys.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource dataSource = ctx.getBean(DataSource.class);
        Connection conn = dataSource.getConnection();
        System.out.println("test");
    }
}
