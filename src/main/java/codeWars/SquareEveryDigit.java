package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

//https://www.codewars.com/kata/546e2562b03326a88e000020/

/**
 * Task
 * In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
 */
@RunWith(Enclosed.class)
public class SquareEveryDigit {

    public int squareDigits(int n) {

        if (n == 0) return n;

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int d = n % 10;
            if (d * d < 10) sb.append(d * d);
            else {
                StringBuilder s2 = new StringBuilder(d * d + "").reverse();
                sb.append(s2);
            }
            n /= 10;
        }

        return Integer.parseInt(sb.reverse().toString());
    }

    public static class SquareDigitTest {
        @Test
        public void test() {
            assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
            assertEquals(0, new SquareEveryDigit().squareDigits(0));
            assertEquals(9414, new SquareEveryDigit().squareDigits(3212));
            assertEquals(16014, new SquareEveryDigit().squareDigits(4012));
        }

    }
}
