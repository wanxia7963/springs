package com.wanxia.ui;


import com.wanxia.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
        ICustomerService cs= (ICustomerService) ac.getBean("customerService");
        cs.outPrint();


    }
}
