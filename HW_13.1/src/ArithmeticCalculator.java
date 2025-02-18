public class ArithmeticCalculator {
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(Operation op) {
        switch (op) {
            case ADD:
                return a + b;
            case SUBSTRACT:
                return a - b;
            case MULTUPLY:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                return 0;
        }
    }
}
