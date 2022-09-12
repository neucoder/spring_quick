package com.ys.factory;

import com.ys.dao.OrderDao;
import com.ys.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("工厂方法构造");
        return new OrderDaoImpl();
    }
}
