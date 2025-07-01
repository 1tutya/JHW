package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Staff staff = (Staff) context.getBean("manager");
        staff.work();

        Staff staff1 = (Staff) context.getBean("employee");
        staff1.work();
    }
}
