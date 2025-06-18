import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(5.0, 10, "Alex");
        Duck duck = new Duck(6.0, 20, "Bob");

        dog.walk();
        dog.move();

        duck.walk();
        duck.move();
    }

}