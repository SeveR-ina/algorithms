package other;

import java.util.*;

/**
 * Problem:
 * Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"
 */
public class FindLongestWord {

    public static String LongestWord(String sen) {
        // https://coderbyte.com/results/SeveRina:Longest%20Word:Java
        sen = sen.replaceAll("[^a-zA-Z1-9 ]", "");
        String[] words = sen.split(" ");
        String max = words[0];
        for (String s : words) {
            if (s.length() > max.length()) {
                max = s;
            }
        }
        return max;
    }

    public static String LongestWordWithStream(String sen) {
        // https://coderbyte.com/results/SeveRina:Longest%20Word:Java
        sen = sen.replaceAll("[^a-zA-Z1-9 ]", "");

        return Arrays.stream(sen.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));

        System.out.println();

        //same but with stream api:
        s = new Scanner(System.in);
        System.out.print(LongestWordWithStream(s.nextLine()));
    }

}