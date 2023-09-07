package other;

public class WordReversal {
    public static void main(String[] args) {
        String input = "Cat loves girl";
        String reversed = reverseWords(input);
        System.out.println(reversed);

        input = "You me us You me";
        reversed = reverseWords(input);
        System.out.println(reversed);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }
}
