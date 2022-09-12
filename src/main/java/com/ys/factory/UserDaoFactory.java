package com.ys.factory;

import com.ys.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDaoImpl getUserDao(){
        return new UserDaoImpl();
    }
}
