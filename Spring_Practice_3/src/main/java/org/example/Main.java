package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer comp = context.getBean("computer", Computer.class);
        comp.getGpu().info();

        Computer comp1 = context.getBean("computer", Computer.class);
        System.out.println(comp == comp1);
        System.out.println(comp.getGpu() == comp1.getGpu());

        context.close();
    }
}
