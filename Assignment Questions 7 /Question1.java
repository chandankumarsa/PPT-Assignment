import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string (s): ");
        String s = scanner.nextLine();

        System.out.print("Enter the second string (t): ");
        String t = scanner.nextLine();

        boolean isIsomorphic = isIsomorphic(s, t);

        System.out.println("Isomorphic: " + isIsomorphic);
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                if (visited.contains(charT)) {
                    return false;
                }
                map.put(charS, charT);
                visited.add(charT);
            }
        }

        return true;
    }
}
