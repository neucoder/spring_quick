package com.ys.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

@Component
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    PlatformTransactionManager transactionManager;

    @Autowired
    TransactionTemplate transactionTemplate;

    public void transfer(){
        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(definition);

        try {
            jdbcTemplate.update("update user set money = ? where name = ?",9,"张三");
            //提交事务
            //int i = 1/0;
            transactionManager.commit(status);
            System.out.println("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            //回滚事务
            transactionManager.rollback(status);
            System.out.println("事务回滚");
        }


    }
}
