package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    @Qualifier("proxyAccountService")
    private IAccountService as;

  /*  @Test
    public  void testFindAll(){
        List<Account> list = as.findAllAccount();
        for(Account a:list){
            System.out.println(a);
        }
    }*/

    @Test
    public void testTransfer(){
        Account acc = new Account();
        as.transfer("aaa","bbb",100f);
    }
}

