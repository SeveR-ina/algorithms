package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

//https://www.codewars.com/kata/541c8630095125aba6000c00

/**
 * Task
 * Digital root is the recursive sum of all the digits in a number.
 * <p>
 * Given n, take the sum of the digits of n.
 * If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
 * The input will be a non-negative integer.
 * <p>
 * Examples:
 * <p>
 * 16  -->  1 + 6 = 7
 * <p>
 * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 */
@RunWith(Enclosed.class)
public class SumOfDigits {

    public static int digitalRoot(int n) {
        if (n < 10) return n;

        int sum = 0;

        while (n != 0) {
            sum = n % 10 + sum;
            n = n / 10;
        }

        while (sum >= 10) {
            sum = digitalRoot(sum);
        }

        return sum;
    }

    public static class DRootExampleTest {
        @Test
        public void Test1() {
            assertEquals("Nope!", 7, SumOfDigits.digitalRoot(16));
        }

        @Test
        public void Test2() {
            assertEquals("Nope!", 6, SumOfDigits.digitalRoot(456));
        }
    }
}
