import java.util.Scanner;

public class Problem7 {
    // Complexity: constant - O(1)
    public static void permutations(String str) {
        permutations(str, 0, str.length() - 1);
    }

    private static void permutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permutations(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    // Complexity: linear - O(N!)
    public static void permutationsLinear(String str) {
        permutationsLinear("", str);
    }

    private static void permutationsLinear(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutationsLinear(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Output:");
        permutations(input);
    }
}
