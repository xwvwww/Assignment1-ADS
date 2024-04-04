import java.util.Scanner;

public class Problem6 {
    // Complexity: constant - O(1)
    public static double power(double a, int n) {
        return Math.pow(a, n);
    }

    // Complexity: linear - O(N)
    public static double powerLinear(double a, int n) {
        if (n == 0)
            return 1;
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Result: " + power(a, n));
    }
}
