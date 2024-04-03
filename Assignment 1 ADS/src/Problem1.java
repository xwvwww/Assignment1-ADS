import java.util.Scanner;

public class Problem1 {
    // Complexity: constant - O(1)
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    // Complexity: linear - O(N)
    public static int min(int[] a) {
        if (a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        int minVal = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minVal) {
                minVal = a[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Minimum element: " + min(arr));
        scanner.close();
    }
}
