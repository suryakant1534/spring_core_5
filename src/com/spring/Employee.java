package com.spring;

public class Employee {
    private int id;
    private String name;
    private double salary;

    static {
        System.out.println("Class Loading");
    }
    public Employee() {
        System.out.println("Employee Instantiation..");
    }

    private void onInit() {
        System.out.println("Init method is called.. from xml");
    }

    private void onDestroy() {
        System.out.println("Destroy method is called.. from xml");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info() {
        System.out.println("Employee id: " + this.id);
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee salary: " + this.salary);
    }
}
