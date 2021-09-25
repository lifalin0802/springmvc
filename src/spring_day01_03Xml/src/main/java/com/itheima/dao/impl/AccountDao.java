package com.itheima.dao.impl;

        import com.itheima.dao.IAccountDao;

public class AccountDao implements IAccountDao {
    public AccountDao(){
        System.out.println("AccountDao 被创建出来了！！！");
    }
    public void saveAccount() {
        System.out.println("dao跑到了");
    }
}
