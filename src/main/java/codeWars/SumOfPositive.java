package codeWars;

//https://www.codewars.com/kata/5715eaedb436cf5606000381/train

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Task
 * You get an array of numbers, return the sum of all of the positives ones.
 * <p>
 * Note: if there is nothing to sum, the sum is default to 0.
 * <p>
 * Example:
 * <p>
 * [1,-4,7,12] => 1 + 7 + 12 = 20
 */
@RunWith(Enclosed.class)
public class SumOfPositive {

    public static int sum(int[] arr) {

        return Arrays.stream(arr).filter(i -> i > 0).sum();
    }

    public static class SumOfPositiveTest {
        @Test
        public void test() {
            assertEquals(15, SumOfPositive.sum(new int[]{1, 2, 3, 4, 5}));
            assertEquals(13, SumOfPositive.sum(new int[]{1, -2, 3, 4, 5}));
            assertEquals(0, SumOfPositive.sum(new int[]{}));
            assertEquals(0, SumOfPositive.sum(new int[]{-1, -2, -3, -4, -5}));
            assertEquals(9, SumOfPositive.sum(new int[]{-1, 2, 3, 4, -5}));
        }
    }
}
