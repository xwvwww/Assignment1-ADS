import java.util.Scanner;

public class Problem10 {
    // Complexity: constant - O(1)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Complexity: linear - O(N)
    public static int gcdLinear(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println("Output:");
        System.out.println(gcd(a, b));
    }
}
