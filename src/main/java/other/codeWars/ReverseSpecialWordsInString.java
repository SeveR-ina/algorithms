package other.codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Task
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * <p>
 * Example:
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 */

//https://www.codewars.com/kata/5264d2b162488dc400000001
@RunWith(Enclosed.class)
public class ReverseSpecialWordsInString {

    public String spinWords(String sentence) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                StringBuilder sb = new StringBuilder();
                for (int l = words[i].length() - 1; l >= 0; l--) {
                    sb.append(words[i].charAt(l));
                }
                words[i] = sb.toString();
            }
        }

        StringBuilder sbN = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                sbN.append(words[i]);
            } else {
                sbN.append(words[i]).append(" ");
            }
        }

        return sbN.toString();
    }

    public static class SpinWordsTest {
        @Test
        public void test() {
            assertEquals("emocleW", new ReverseSpecialWordsInString().spinWords("Welcome"));
            assertEquals("Hey wollef sroirraw", new ReverseSpecialWordsInString().spinWords("Hey fellow warriors"));
        }

    }
}
