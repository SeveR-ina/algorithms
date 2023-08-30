package other.streamApi;

public class CalculatorWithLambda {
    public static void main(String[] args) {
        System.out.println(calculate(5, 3, Double::sum));
        System.out.println(calculate(5, 3, (a, b) -> a * b));
        System.out.println(calculate(10, 2, (a, b) -> a / b));
        System.out.println(calculate(8, 3, (a, b) -> a - b));
        System.out.println(calculate(25, 0, (a, b) -> Math.sqrt(a))); //square root
        System.out.println(calculate(2, 3, Math::pow)); // exponentiation
        System.out.println(calculate(5, 3, (a, b) -> Math.pow((a + b) / a, 117))); // addition, division, exponentiation
    }

    public static double calculate(double a, double b, CalculatorOperation operation) {
        return operation.calculate(a, b);
    }
}

interface CalculatorOperation {
    double calculate(double a, double b);
}

