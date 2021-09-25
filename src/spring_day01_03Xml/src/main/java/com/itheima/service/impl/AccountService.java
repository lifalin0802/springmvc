package com.itheima.service.impl;

        import com.itheima.dao.IAccountDao;
        import com.itheima.dao.impl.AccountDao;
        import com.itheima.factory.BeanFactory;
        import com.itheima.service.IAccountService;

public class AccountService implements IAccountService {
    IAccountDao dao =  null;
    public AccountService(){
        System.out.println("AccountService 创建出来了！！");
    }

    public void saveAccount() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
       dao = (IAccountDao) new AccountDao();
  //      dao = (IAccountDao)BeanFactory.getBean("accountDao");//new AccountDao();
        dao.saveAccount();
    }
}
