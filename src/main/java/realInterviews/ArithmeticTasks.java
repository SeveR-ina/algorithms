package realInterviews;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(Enclosed.class)
public class ArithmeticTasks {
    /**
     * Returns the average (arithmetic mean) of the arguments.
     * Sum of elements / number of elements
     */
    private static Double mean(Collection<Integer> nums) {
        double result;
        int n = nums.size();
        if (n == 0) return 0d;
        double sum = 0d;
        for (Integer i : nums) {
            sum = sum + i;
        }
        result = sum / n;
        return result;
    }

    /**
     * Mode will calculate the most frequently occurring value from a list of supplied numbers.
     * If there are two or more most frequently occurring values in the supplied data, the function returns the lowest of the values
     */
    private static Integer mode(Collection<Integer> nums) {
        if (nums.isEmpty()) {
            return null; // Return null for an empty list
        }
        Map<Integer, Integer> results = new HashMap<>();
        for (Integer num : nums) {
            results.put(num, results.getOrDefault(num, 0) + 1);
        }
        Integer max = results.values().stream().max(Comparator.comparingInt(a -> a)).get();

//        int maxCount = 0; // Stores the maximum count of a number
//        int mode = 0;     // Stores the mode value
//        for (Integer num : nums) {
//            int count = 0; // Count how many times 'num' appears in the list
//            for (Integer n : nums) {
//                if (n.equals(num)) {
//                    count++;
//                }
//            }
//            if (count > maxCount || (count == maxCount && num < mode)) {
//                maxCount = count;
//                mode = num;
//            }
//        }
//        return mode;
        return results.keySet().stream().filter(n -> results.get(n).equals(max)).min(Comparator.comparingInt(a -> a)).get();
    }

    public static class ArithmeticTasksTests {

        @Test
        public void testMean() {
            assertEquals(0d, mean(List.of()), 0d);
            assertEquals(1d, mean(List.of(1)), 0d);
            assertEquals(1.2d, mean(List.of(-1, 1, -3, 4, 5)), 0d);
            assertEquals(2d, mean(List.of(-1, 1, -3, 4, 5, 6)), 0d);
            assertEquals(8.52380952380952, mean(List.of(1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)), 0.00000000001);
            assertEquals(9, mean(List.of(1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)), 0.0);
        }

        @Test
        public void testMode() {
            // mode
            assertNull(mode(List.of()));
            assertEquals(1, (int) mode(List.of(1)));
            assertEquals(2, (int) mode(List.of(-1, 2, -2, 2, 2, -3)));
            assertEquals(-1, (int) mode(List.of(-1, 1, -1, 1, -1, 1)));
            assertEquals(3, mode(List.of(1, 2, 2, 4, 4, 4, 3, 3, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)), 0.00000000001);
            assertEquals(3, mode(List.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)), 0.0);
        }
    }

    public static void main(String[] args) {
        JUnitCore.main(ArithmeticTasksTests.class.getName());
    }
}
