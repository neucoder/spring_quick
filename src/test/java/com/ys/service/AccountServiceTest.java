package com.ys.service;


import com.ys.config.JdbcConfig;
import com.ys.config.SpringConfig;
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
    private JdbcConfig jdbcConfig;

    @Test
    public void testTransfer() throws IOException {
        accountService.transfer("Tom","Jerry",100D);
    }

    @Test
    public void testJdbcConfig() throws NoSuchFieldException, IllegalAccessException {
        Field driver = JdbcConfig.class.getDeclaredField("userName");
        driver.setAccessible(true);
        String driverVar = (String) driver.get(jdbcConfig);
        System.out.println(driverVar);

    }


}
