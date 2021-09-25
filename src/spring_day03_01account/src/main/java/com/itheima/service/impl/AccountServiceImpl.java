package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao dao;
    public void setAccountDao(AccountDaoImpl accountDao) {
        this.dao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        List<Account> accounts = dao.findAllAccount();
        return accounts;
    }

    @Override
    public Account findAccountById(Integer id) {
        Account account = dao.findAccountById(id);
        return account;
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

    @Override
    public void transfer(String from, String to, Float money) {
        Account s = dao.findAccountByName(from);
        Account t = dao.findAccountByName(to);

        s.setMoney(s.getMoney() - money);
        t.setMoney(t.getMoney() + money);
        dao.updateAccount(s);
         int i = 1/0;
        dao.updateAccount(t);
    }

    @Override
    public Account findAccountByName(String name) {
        Account account = dao.findAccountByName(name);
        return account;
    }
}
