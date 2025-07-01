package org.example;

public class Manager implements Staff{

    public Manager() {
        System.out.println("Manager constructor");
    }
    @Override
    public void work() {
        System.out.println("Manager works");
    }
}
