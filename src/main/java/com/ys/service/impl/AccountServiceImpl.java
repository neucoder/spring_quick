package com.ys.service.impl;

import com.ys.dao.AccountDao;
import com.ys.model.TransferStatus;
import com.ys.service.AccountService;
import com.ys.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Transactional(rollbackFor = {IOException.class})
    public void transfer(String out,String in ,Double money) throws IOException {
        Boolean sucess = true;
        try{
            accountDao.outMoney(out,money);
            //int i = 1/0;
            accountDao.inMoney(in,money);
        }catch (Exception e){
            sucess = false;
        }
        finally {
            if(sucess){
                logService.log(out,in,money, TransferStatus.SUCESS.getDesc());
            }else {
                logService.log(out,in,money, TransferStatus.FAIL.getDesc());
            }
        }
    }

}