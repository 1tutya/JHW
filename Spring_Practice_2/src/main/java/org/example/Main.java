package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Computer comp = context.getBean("computer", Computer.class);

        System.out.println(comp.getGpu());
    }
}
