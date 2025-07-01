package org.example;

public class Employee implements Staff {

    public Employee() {
        System.out.println("Employee Constructor");
    }
    @Override
    public void work() {
        System.out.println("Employee works");
    }
}
