package com.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeWithAnnotation {
    public EmployeeWithAnnotation() {
        System.out.println("EmployeeWithAnnotation object initialized..");
    }

    @PostConstruct
    private void onInit() {
        System.out.println("Init method is called.. from annotation");
    }

    @PreDestroy
    private void onDestroy() {
        System.out.println("Destroy method is called.. from annotation");
    }
}
