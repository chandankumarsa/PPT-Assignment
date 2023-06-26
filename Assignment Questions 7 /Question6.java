import java.util.Scanner;

public class StringShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string (goal): ");
        String goal = scanner.nextLine();

        boolean canShift = canShiftString(s, goal);

        System.out.println("Can s become goal after shifts? " + canShift);
    }

    public static boolean canShiftString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubleS = s + s;

        return doubleS.contains(goal);
    }
}
