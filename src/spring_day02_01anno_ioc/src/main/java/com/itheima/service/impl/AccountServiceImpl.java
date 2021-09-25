package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDao;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service(value = "accountService")
//@Scope("prototype") //若不写此注解，意思就是默认单例，即singleton, 若是多例则spring不负责销毁
public class AccountServiceImpl implements IAccountService {
//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao1")
    IAccountDao dao;

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl 创建出来了！！");
    }


    public void saveAccount() {
        dao.saveAccount();
    }

    @PostConstruct
    public void init(){
        System.out.println("init执行了");
    }

    @PreDestroy
    public void distroy(){
        System.out.println("distroy执行了");
    }
}
