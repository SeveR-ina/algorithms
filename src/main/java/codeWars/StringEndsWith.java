package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class StringEndsWith {

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static class StringEndsWithTest {
        @Test
        public void staticTests() {
            check("samurai", "ai", true);
            check("sumo", "omo", false);
            check("ninja", "ja", true);
            check("sensei", "i", true);
            check("samurai", "ra", false);
            check("abc", "abcd", false);
            check("abc", "abc", true);
            check("abcabc", "bc", true);
            check("ails", "fails", false);
            check("fails", "ails", true);
            check("this", "fails", false);
            check("this", "", true);
            check(":-)", ":-(", false);
            check("!@#$%^&*() :-)", ":-)", true);
            check("abc\n", "abc", false);
        }

        private static void check(String str, String ending, boolean expected) {
            boolean result = StringEndsWith.solution(str, ending);
            assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
        }
    }
}
