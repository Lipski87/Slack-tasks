package pl.maciek.zadania_rekrutacyjne;

public class FibonacciSequence {
    public static void main(String[] args) {

        int fib = 14;

        System.out.println(fibonacciSequence(fib));

    }

    public static long fibonacciSequence(int n) {

        int number1 = 1; //czy pierwszą liczbą ciągu, nie powinno być zero?
        int number2 = 1;
        int x = 0;

        if (n == 0) {
            return 0;
        } else {
            if (n != 1 && n != 2) {

                for (int i = 3; i <= n; i++) {
                    x = number1 + number2;
                    number1 = number2;
                    number2 = x;
                }
            } else {
                return 1;
            }
            return x;
        }
    }
}