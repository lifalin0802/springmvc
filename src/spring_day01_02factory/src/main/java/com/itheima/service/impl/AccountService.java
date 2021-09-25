package com.itheima.service.impl;

        import com.itheima.dao.IAccountDao;
        import com.itheima.factory.BeanFactory;
        import com.itheima.service.IAccountService;

public class AccountService implements IAccountService {

    public void saveAccount() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        IAccountDao dao =  null;

        dao = (IAccountDao) new AccountService();
        dao = (IAccountDao)BeanFactory.getBean("accountDao");//new AccountDao();
        //  dao = (IAccountDao)Class.forName("com.itheima.dao.impl.AccountDao").newInstance();

        dao.saveAccount();
    }
}
