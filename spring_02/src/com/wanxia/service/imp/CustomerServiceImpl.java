package com.wanxia.service.imp;




import com.wanxia.service.ICustomerService;

import java.util.Date;


public class CustomerServiceImpl implements ICustomerService {

    private String driver;
    private  int port;




    public String getDriver() {
        return driver;
    }

    public int getPort() {
        return port;
    }



    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setPort(int port) {
        this.port = port;
    }





    @Override
    public void saveCustomer() {
        System.out.println("业务层调用持久层！");

    }

    public void outPrint(){
        System.out.println(driver+"."+port+".");
    }

}
