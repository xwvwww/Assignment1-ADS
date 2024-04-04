import java.util.Scanner;

public class Problem8 {
    // Complexity: constant - O(1)
    public static boolean allDigits(String s) {
        return s.matches("[0-9]+");
    }

    // Complexity: linear - O(N)
    public static boolean allDigitsLinear(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Output:");
        if (allDigits(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
