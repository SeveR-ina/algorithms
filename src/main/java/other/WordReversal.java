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
        // Split the input string into words
        String[] words = input.split(" ");

        // Create a StringBuilder to store the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);

            // Append a space if it's not the last word
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        // Convert the StringBuilder to a string and return
        return reversedSentence.toString();
    }
}
