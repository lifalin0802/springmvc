package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServiceTest {
    @Test
    public  void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        List<Account> list = as.findAllAccount();
        for(Account a:list){
            System.out.println(a);
        }
    }

    @Test
    public void testSave(){
        Account acc = new Account();
        acc.setName("ddd");
        acc.setMoney(1000f);
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.saveAccount(acc);
    }
}
