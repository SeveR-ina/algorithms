package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    public static class SmallestIntegerFinderTest {

        @Test
        public void example1() {
            int expected = 11;
            int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
            assertEquals(expected, actual);
        }


        @Test
        public void example2() {
            int expected = -33;
            int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, 8, -33});
            assertEquals(expected, actual);
        }

        @Test
        public void example3() {
            int expected = Integer.MIN_VALUE;
            int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE});
            assertEquals(expected, actual);
        }
    }
}
