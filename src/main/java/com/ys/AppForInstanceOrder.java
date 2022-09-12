package com.ys;

import com.ys.dao.OrderDao;
import com.ys.dao.UserDao;
import com.ys.dao.impl.UserDaoImpl;
import com.ys.factory.OrderDaoFactory;
import com.ys.factory.UserDaoFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {


//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

//        方法二 静态工厂实例化
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object dao = context.getBean("orderDao");
//        ((OrderDao)dao).save();

//        方法三 非静态工厂实例化
//        UserDaoImpl userDao = new UserDaoFactory().getUserDao();
//        userDao.save();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao)ctx.getBean("userDao");
        UserDao userDao2 = (UserDao)ctx.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);

    }
}
