package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

//https://www.codewars.com/kata/545cedaa9943f7fe7b000048

/**
 * Task
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 */

@RunWith(Enclosed.class)
public class DetectPangram {
    public boolean check(String sentence) {
        String example = "abcdefghijklmnopqrstuvwxyz";

        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        sentence = sentence.toLowerCase();

        SortedSet<Character> list = new TreeSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            list.add(sentence.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for (Character c : list) {
            sb.append(c);
        }

        return sb.toString().equals(example);
    }

    public static class PangramTest {
        @Test
        public void test1() {
            String pangram1 = "The quick brown fox jumps over the lazy dog.";
            DetectPangram pc = new DetectPangram();
            assertTrue(pc.check(pangram1));
        }

        @Test
        public void test2() {
            String pangram2 = "You shall not pass!";
            DetectPangram pc = new DetectPangram();
            assertFalse(pc.check(pangram2));
        }

        @Test
        public void test3() {
            String pangram3 = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
            DetectPangram pc = new DetectPangram();
            assertTrue(pc.check(pangram3));
        }
    }
}
