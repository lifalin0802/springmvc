package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao2")
public class AccountDao2 implements IAccountDao {
    public AccountDao2() {
        System.out.println("AccountDao2 被创建出来了！！！");
    }

    public void saveAccount() {
        System.out.println("dao2跑到了");
    }
}