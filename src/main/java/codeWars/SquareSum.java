package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class SquareSum {

    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(i -> i * i).sum();
    }

    public static class SquareSumTests {
        @Test
        public void testBasic() {
            assertEquals(9, SquareSum.squareSum(new int[]{1, 2, 2}));
            assertEquals(5, SquareSum.squareSum(new int[]{1, 2}));
            assertEquals(50, SquareSum.squareSum(new int[]{5, -3, 4}));
            assertEquals(0, SquareSum.squareSum(new int[]{}));
        }
    }
}
