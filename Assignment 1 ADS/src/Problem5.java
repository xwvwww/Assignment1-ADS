import java.util.Scanner;

public class Problem5 {
    // Complexity: constant - O(1)
    public static int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative numbers");

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Complexity: exponential - O(2^N)
    public static int fibonacciLinear(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative numbers");

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci: " + fibonacci(num));
    }
}
