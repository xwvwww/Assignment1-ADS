import java.util.Scanner;

public class Problem2 {
    // Complexity: constant - O(1)
    public static double average(int[] a) {
        if (a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        double sum = 0;
        for (int elem : a) {
            sum += elem;
        }
        return sum / a.length;
    }

    // Complexity: linear - O(N)
    public static double averageLinear(int[] a) {
        if (a.length == 0)
            throw new IllegalArgumentException("Array must not be empty");

        double sum = 0;
        for (int elem : a) {
            sum += elem;
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Average: " + average(arr));
        scanner.close();
    }
}
