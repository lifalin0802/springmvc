package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountService;

public class InstanceFactory {
public IAccountService getAccountService() {
        return new AccountService("瞎写的..");
        }
 }