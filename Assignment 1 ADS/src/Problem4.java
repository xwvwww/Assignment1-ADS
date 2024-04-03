import java.util.Scanner;

public class Problem4 {
    // Complexity: constant - O(1)
    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Complexity: linear - O(N)
    public static int factorialLinear(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Factorial: " + factorial(num));
    }
}
