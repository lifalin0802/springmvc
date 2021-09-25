package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService src = (IAccountService) ac.getBean("accountService");
        IAccountService src2 = (IAccountService) ac.getBean("accountService");
        System.out.println(src == src2);
        src.saveAccount();
        ac.close();
    }
}
