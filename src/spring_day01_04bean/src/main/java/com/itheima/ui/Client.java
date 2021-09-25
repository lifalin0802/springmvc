package com.itheima.ui;
        import com.itheima.service.IAccountService;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {
		
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml"); // ac.close(); 用不了，多态，父类方法没有
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService src = (IAccountService) ac.getBean("accountService");
        src.saveAccount();
        ac.close();
    }
}
