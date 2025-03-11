import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        //todo Дописать логику работы метода сюда. Метод main не трогаем!!!
        int sum = 0;
        int count = 0;
        String number = String.valueOf(num);
        for ( ; count < number.length(); count++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(count)));
        }
        return (double) sum / count; //todo заменить 0 на корректный результат.
    }
}