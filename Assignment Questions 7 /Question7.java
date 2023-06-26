import java.util.Scanner;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string (t): ");
        String t = scanner.nextLine();

        boolean isEqual = backspaceCompare(s, t);

        System.out.println("Are the strings equal after typing into empty text editors? " + isEqual);
    }

    public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}
