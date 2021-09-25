package com.itheima.ui;

import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;

/*
* 模拟表现层 用于调用业务层，实际开发中，这里会是一个servlet
* */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        for(int i=0;i<5;i++){
            IAccountService as = (IAccountService)BeanFactory.getBean("accountService"); //  IAccountService as = new AccountService();
            as.saveAccount();
            System.out.println(as);
        }


    }
}
