package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class RegexValidatePinCode {

    public static boolean validatePin(String pin) {
        /*char[] arr = pin.toCharArray();
        boolean res = true;
        if (arr.length == 5 || arr.length < 4 || arr.length > 6) return false;
        for (Character c : arr) {
            if (!Character.isDigit(c)) return false;
        }
        return res;*/
        return pin.chars().allMatch(Character::isDigit) && pin.length() == 4 || pin.length() == 6;
    }

    public static class SolutionTest {
        @Test
        public void validPins() {
            assertTrue(RegexValidatePinCode.validatePin("1234"));
            assertTrue(RegexValidatePinCode.validatePin("0000"));
            assertTrue(RegexValidatePinCode.validatePin("1111"));
            assertTrue(RegexValidatePinCode.validatePin("123456"));
            assertTrue(RegexValidatePinCode.validatePin("098765"));
            assertTrue(RegexValidatePinCode.validatePin("000000"));
            assertTrue(RegexValidatePinCode.validatePin("090909"));
        }

        @Test
        public void nonDigitCharacters() {
            assertFalse(RegexValidatePinCode.validatePin("a234"));
            assertFalse(RegexValidatePinCode.validatePin(".234"));
        }

        @Test
        public void invalidLengths() {
            assertFalse(RegexValidatePinCode.validatePin("1"));
            assertFalse(RegexValidatePinCode.validatePin("12"));
            assertFalse(RegexValidatePinCode.validatePin("123"));
            assertFalse(RegexValidatePinCode.validatePin("12345"));
            assertFalse(RegexValidatePinCode.validatePin("1234567"));
            assertFalse(RegexValidatePinCode.validatePin("-1234"));
            assertFalse(RegexValidatePinCode.validatePin("1.234"));
            assertFalse(RegexValidatePinCode.validatePin("00000000"));
        }
    }
}
