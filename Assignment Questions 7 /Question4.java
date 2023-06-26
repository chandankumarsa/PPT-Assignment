import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseWords(sentence);

        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String reversedWord = reverseWord(words[i]);
            sb.append(reversedWord);

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}
