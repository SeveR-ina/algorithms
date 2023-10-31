package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class ReverseWords {

    public static String reverseWords(final String original) {
        return Arrays.stream(original.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    public static class ReverseWordsTest {
        @Test
        public void exampleCases() {
            assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
            assertEquals("elppa", ReverseWords.reverseWords("apple"));
            assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
            assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
        }
    }
}
