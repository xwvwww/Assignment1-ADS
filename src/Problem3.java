import java.util.Scanner;

public class Problem3 {
    // Complexity: constant - O(1)
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

    // Complexity: linear - O(sqrt(N))
    public static boolean isPrimeLinear(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrimeLinear(num))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }
}
