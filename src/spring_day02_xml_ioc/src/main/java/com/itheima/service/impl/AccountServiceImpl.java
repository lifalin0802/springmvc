package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao dao;

    @Override
    public List<Account> findAllAccount() {
        return dao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer id) {
        return dao.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        dao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        dao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        dao.deleteAccount(id);
    }

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.dao = accountDao;
    }
}
