package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

//https://www.codewars.com/kata/523f5d21c841566fde000009

/**
 * Task
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 * <p>
 * It should remove all values from list a, which are present in list b keeping their order.
 * <p>
 * Example:
 * <p>
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

@RunWith(Enclosed.class)
public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        if (a.length == 0) return new int[]{};

        int[] res = new int[a.length];

        int c = 0;

        if (b.length > 0) {
            for (int aI : a) {
                boolean foundInB = false;
                for (int bI : b) {
                    if (aI == bI) {
                        foundInB = true;
                        break;
                    }
                }
                if (!foundInB) {
                    res[c] = aI;
                    c++;
                }
            }
            return Arrays.copyOf(res, c);
        }

        return Arrays.copyOf(a, a.length);
    }

    public static class ArrayDiffTest {

        @Test
        public void sampleTests() {
            assertArrayEquals(new int[]{2}, ArrayDiff.arrayDiff(new int[]{1, 2}, new int[]{1}));
            assertArrayEquals(new int[]{2, 2}, ArrayDiff.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
            assertArrayEquals(new int[]{1}, ArrayDiff.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
            assertArrayEquals(new int[]{1, 2, 2}, ArrayDiff.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
            assertArrayEquals(new int[]{}, ArrayDiff.arrayDiff(new int[]{}, new int[]{1, 2}));
        }

    }
}
