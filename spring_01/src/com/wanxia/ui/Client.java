package com.wanxia.ui;

import com.wanxia.dao.ICustomerDao;
import com.wanxia.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        ICustomerService cs= (ICustomerService) ac.getBean("customerService");
        ICustomerDao cd = (ICustomerDao) ac.getBean("customerDao");
        System.out.println(cs);
        System.out.println(cd);

    }
}
