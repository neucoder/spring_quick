package com.ys.service.impl;

import com.ys.dao.LogDao;
import com.ys.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void log(String out,String in,Double money, String status) {
        logDao.log("转账操作由"+out+"到"+in+",金额："+money + status);
    }
}
