package com.ys.service;


import com.ys.config.JdbcConfig;
import com.ys.config.SpringConfig;
import com.ys.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.lang.reflect.Field;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private JdbcConfig jdbcConfig;

    @Test
    public void testTransfer() throws IOException {
        System.out.println(String.format("before transfer:tom:%f,jerry:%f",
                accountDao.queryMoney("Tom"),
                accountDao.queryMoney("Jerry")));
        accountService.transfer("Tom","Jerry",100D);
        System.out.println(String.format("after transfer:tom:%f,jerry:%f",
                accountDao.queryMoney("Tom"),
                accountDao.queryMoney("Jerry")));

    }

    @Test
    public void testSelectMoney(){
        Double money = accountDao.queryMoney("Tom");
        System.out.println("money : "+ money);
    }

    @Test
    public void testJdbcConfig() throws NoSuchFieldException, IllegalAccessException {
        Field driver = JdbcConfig.class.getDeclaredField("userName");
        driver.setAccessible(true);
        String driverVar = (String) driver.get(jdbcConfig);
        System.out.println(driverVar);

    }


}
