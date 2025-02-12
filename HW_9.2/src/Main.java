import java.util.Scanner;

public class Main {
    static int a;

    public static int inputNumber() {
        System.out.println("Enter an integer: ");
        return new Scanner(System.in).nextInt();
    }

    public static void isEven(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        a = inputNumber();
        isEven(a);
    }
}