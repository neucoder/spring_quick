package com.ys.service.impl;

import com.ys.dao.AccountDao;
import com.ys.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void transfer(String out,String in ,Double money) throws IOException {
        accountDao.outMoney(out,money);
        if(true){
            throw new IOException();
        }
        accountDao.inMoney(in,money);
    }

}