package com.itheima.ui;

        import com.itheima.dao.IAccountDao;
        import com.itheima.factory.BeanFactory;
        import com.itheima.service.IAccountService;
        import com.itheima.service.impl.AccountService;
        import org.springframework.beans.factory.xml.XmlBeanFactory;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.springframework.context.support.FileSystemXmlApplicationContext;
        import org.springframework.core.io.ClassPathResource;
        import org.springframework.core.io.Resource;

/*
 * 获取spring 的Ioc 容器
 * spring  中 ApplicationContext 的三个常用实现类：
	ClassPathXmlApplicationContext: 加载 类路径下的配置文件，即配置文件必须在类路径下，否则加载不了
	FileSystemXmlApplicationContext: 可加载 磁盘任意路径 的文件 但必须要访问权限
    AnnotationConfigApplicationContext：读取注解 创建容器的

*核心容器 core中 两个接口引发的问题：
	ApplicationContext: 单例模式实用
		在构建核心容器时，创建对象 策略是 立即加载  即 读取configFile后 立刻 反射+创建对象
	BeanFactory:      多例模式实用
延迟加载，即 在用时/getBean 时创建对象
spring有个功能：可以switch创建对象的方式/策略
ApplicationContext 可以switch 立即加载or 延迟加载
BeanFactory 是个顶层接口 各种功能拓展 都在其子接口上，例如ApplicationContext
 * */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
      //  ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\workspace\\spring_day03_Xml\\src\\main\\resources\\bean.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService src = (IAccountService) ac.getBean("accountService");
        IAccountDao dao = ac.getBean("accountDao",IAccountDao.class);
//           IAccountService as = new AccountService();
        System.out.println(src);
        System.out.println(dao);
        src.saveAccount();
//        // 方法2 ： 用BeanFactory 代替 ApplicationContext
//        Resource resource = new ClassPathResource("bean.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(resource);
//        IAccountService src =  (IAccountService)factory.getBean("accountService");
//        System.out.println(src);
    }
}
