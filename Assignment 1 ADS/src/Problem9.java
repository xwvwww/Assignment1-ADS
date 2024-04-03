import java.util.Scanner;

public class Problem9 {
    // Complexity: constant - O(1)
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // Complexity: linear - O(N)
    public static int binomialCoefficientLinear(int n, int k) {
        if (k < 0 || k > n)
            return 0;

        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp[n][k];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println("Output:");
        System.out.println(binomialCoefficient(n, k));
    }
}
