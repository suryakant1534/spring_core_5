package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = (Employee) context.getBean("employee");
        employee.setId(1332);
        employee.setName("Surya Kant");
        employee.setSalary(2342);
        employee.info();

        context.close();
    }
}
