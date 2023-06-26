import java.util.Scanner;

public class ReverseSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        String reversedString = reverseSubstring(s, k);

        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int i = 0;

        while (i < chars.length) {
            int start = i;
            int end = Math.min(i + k - 1, chars.length - 1);

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }

            i += 2 * k;
        }

        return String.valueOf(chars);
    }
}
