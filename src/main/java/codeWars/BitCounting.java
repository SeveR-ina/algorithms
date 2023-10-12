package codeWars;

//https://www.codewars.com/kata/526571aae218b8ee490006f4/

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Task
 * Write a function that takes an integer as input, and returns the number of bits that are equal
 * to one in the binary representation of that number.
 * <p>
 * You can guarantee that input is non-negative.
 * <p>
 * Example:
 * <p>
 * The binary representation of 1234 is 10011010010, so the function should return 5
 */
@RunWith(Enclosed.class)
public class BitCounting {

    public static int countBits(int n) {

        String number = Integer.toBinaryString(n);

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') sum++;
        }

        return sum;
    }

    public static class BitCountingTest {
        @Test
        public void testGame() {
            assertEquals(5, BitCounting.countBits(1234));
            assertEquals(1, BitCounting.countBits(4));
            assertEquals(3, BitCounting.countBits(7));
            assertEquals(2, BitCounting.countBits(9));
            assertEquals(2, BitCounting.countBits(10));
        }
    }
}
