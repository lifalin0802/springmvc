package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDao implements IAccountDao {
    public AccountDao() {
        System.out.println("AccountDao1 被创建出来了！！！");
    }

    public void saveAccount() {
        System.out.println("dao1跑到了");
    }
}
