package com.itheima.service.impl;

import com.itheima.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("save");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("update");
    }

    @Override
    public int deleteAccount() {
        System.out.println("delete");
        return 0;
    }
}
