public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calc = new ArithmeticCalculator(10, 5);
        System.out.println(calc.calculate(Operation.DIVIDE));
    }
}
