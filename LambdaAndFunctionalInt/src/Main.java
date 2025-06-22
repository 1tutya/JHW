import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Test test = () -> System.out.println("Hello World");
        test.test();

        Test1 test1 = (a) -> System.out.println(a);
        test1.test1(10);

        Predicate<Integer> isPositive = (a) -> a >= 0;
        System.out.println(isPositive.test(1));
        System.out.println(isPositive.test(-1));

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(2, 3));

        UnaryOperator<Integer> square = (a) -> a * a;
        System.out.println(square.apply(3));

        Function<Integer, String> iToS = (a) -> String.valueOf(a);
        System.out.println(iToS.apply(2) + 1111);

        Consumer<Integer> print = (a) -> System.out.println(a);
        print.accept(999);

        Supplier<String> stringFromKeyboard = () -> {
            System.out.println("Enter a string");
            return new Scanner(System.in).nextLine();
        };
        System.out.println(stringFromKeyboard.get());

    }
}
