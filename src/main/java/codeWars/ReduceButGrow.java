package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class ReduceButGrow {

    public static int grow(int[] x) {
        int res = 1;
        for (Integer i : x) {
            res = res * i;
        }
        return res;
    }

    public static class ReduceButGrowTest {
        @Test
        public void testSomething() {
            assertEquals(6, ReduceButGrow.grow(new int[]{1, 2, 3}));
            assertEquals(16, ReduceButGrow.grow(new int[]{4, 1, 1, 1, 4}));
            assertEquals(64, ReduceButGrow.grow(new int[]{2, 2, 2, 2, 2, 2}));
        }
    }
}
