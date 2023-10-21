package codeWars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class XO {

    public static boolean getXO(String str) {

        str = str.toLowerCase();

        char[] ch = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int sumX = 0;
        int sumO = 0;

        for (var entry : map.entrySet()) {
            if (entry.getKey() == 'x') sumX = entry.getValue();
            if (entry.getKey() == 'o') sumO = entry.getValue();
        }

        return sumX == sumO;
    }

    static class SolutionTest {
        @ParameterizedTest(name = "str = \"{1}\"")
        @DisplayName("Sample tests")
        @CsvSource(textBlock = """
                    true,  ooxx
                    false, xooxx
                """)
        void sampleTests(boolean expected, String input) {
            assertEquals(expected, XO.getXO(input));
        }
    }
}
