package codeWars;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

//https://www.codewars.com/kata/54da5a58ea159efa38000836

/**
 * Task
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 * <p>
 * For example,
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 */

public class FindOddInArray {

    public static int findIt(int[] a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) return entry.getKey();
        }

        return 0;
    }

    public static class FindOddTest {

        @Test
        public void findTest() {
            assertEquals(5, FindOddInArray.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
            assertEquals(-1, FindOddInArray.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
            assertEquals(5, FindOddInArray.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
            assertEquals(10, FindOddInArray.findIt(new int[]{10}));
            assertEquals(10, FindOddInArray.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
            assertEquals(1, FindOddInArray.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
        }
    }
}
