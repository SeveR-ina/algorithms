package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Formatter;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {

        //String regex = "(\\d{3})\\s(\\d{3})-(\\d{4})";

        StringBuilder sb = new StringBuilder();

        for (Integer i : numbers) {
            sb.append(i);
        }

        String newStr = String.format("(%s) %s-%s", sb.substring(0, 3), sb.substring(3, 6), sb.substring(6));

        return sb.toString().replace(sb.toString(), newStr);
    }

    public static class CreatePhoneNumberTests {
        @Test
        public void tests() {
            assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        }
    }
}
