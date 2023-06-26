import java.util.Scanner;

public class AddStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();

        String sum = addStrings(num1, num2);

        System.out.println("Sum: " + sum);
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            int digitSum = sum % 10;
            carry = sum / 10;

            sb.insert(0, digitSum);

            i--;
            j--;
        }

        return sb.toString();
    }
}
