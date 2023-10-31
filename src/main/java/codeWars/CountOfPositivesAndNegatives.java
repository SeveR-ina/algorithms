package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Enclosed.class)
public class CountOfPositivesAndNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input.length == 0 || Arrays.stream(input).filter(Objects::isNull).count() > 0) return input;
        int countP = (int) Arrays.stream(input).filter(i -> i > 0).count();
        int sumN = Arrays.stream(input).filter(i -> i < 0).sum();
        return new int[]{countP, sumN};
    }

    public static class CountOfPositivesAndNegativesTests {
        @Test
        public void countPositivesSumNegatives_BasicTest() {
            int[] expectedResult = new int[]{10, -65};
            assertArrayEquals(expectedResult, CountOfPositivesAndNegatives.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
        }

        @Test
        public void countPositivesSumNegatives_InputWithZeroes() {
            int[] expectedResult = new int[]{8, -50};
            assertArrayEquals(expectedResult, CountOfPositivesAndNegatives.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
        }
    }
}
