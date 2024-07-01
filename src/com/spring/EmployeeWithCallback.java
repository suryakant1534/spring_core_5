package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeWithCallback implements InitializingBean, DisposableBean {
    public EmployeeWithCallback() {
        System.out.println("EmployeeWithCallback initialized..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method is called from callback.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method is called from callback");
    }
}
