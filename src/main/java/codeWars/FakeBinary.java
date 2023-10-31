package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
 * Return the resulting string.
 * Note: input will never be an empty string
 */

@RunWith(Enclosed.class)
public class FakeBinary {

    public static String fakeBin(String numberString) {
/*        char[] arr = numberString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (Character c : arr) {
            if (c < '5') c = '0';
            else c = '1';
            sb.append(c);
        }
        return sb.toString();*/
        return numberString.chars()
                .mapToObj(c -> (char) c)
                .map(c -> c < '5' ? '0' : '1')
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public static class FakeBinaryTest {
        @Test
        public void testSomething() {
            assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
            assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
            assertEquals("011011110000101010000011011", FakeBinary.fakeBin("366058562030849490134388085"));
        }
    }
}
