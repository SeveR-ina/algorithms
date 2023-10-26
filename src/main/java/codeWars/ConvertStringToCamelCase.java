package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class ConvertStringToCamelCase {

    static String toCamelCase(String s) {
        char[] sArr = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {
            if (sArr[i] == '-' || sArr[i] == '_') {
                if (i + 1 < s.length()) {
                    sArr[i + 1] = Character.toUpperCase(sArr[i + 1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Character c : sArr) {
            sb.append(c);
        }

        return sb.toString().replaceAll("-", "").replaceAll("_", "");
    }

    public static class ConvertStringToCamelCaseTest {
        @Test
        public void testSomeUnderscoreLowerStart() {
            String input = "the_Stealth_Warrior";
            System.out.println("input: " + input);
            assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
        }

        @Test
        public void testSomeDashLowerStart() {
            String input = "the-Stealth-Warrior";
            System.out.println("input: " + input);
            assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
        }
    }
}
