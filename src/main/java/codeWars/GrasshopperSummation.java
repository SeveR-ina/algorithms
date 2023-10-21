package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class GrasshopperSummation {

    public static int summation(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + summation(n - 1);
        }
    }

    public static class GrassHopperTest {
        @Test
        public void test1() {
            assertEquals(1, GrasshopperSummation.summation(1));
        }

        @Test
        public void test2() {
            assertEquals(36, GrasshopperSummation.summation(8));
        }
    }
}
