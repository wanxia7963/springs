package com.wanxia.service.imp;

import com.wanxia.dao.ICustomerDao;
import com.wanxia.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerDao customerDao=null;
    @Override
    public void saveCustomer() {
        System.out.println("业务层调用持久层！");
        customerDao.saveCustomer();
    }

    public void setPort(String port) {
    }

    public void setToday(String today) {
    }

    public void setDriver(String driver) {
    }
}
