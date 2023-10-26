package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class CountingSheep {

    public int countSheeps(Boolean[] arrayOfSheeps) {
 //       return (int) Arrays.stream(arrayOfSheeps).filter(Boolean::valueOf).count();
        return (int) Arrays.stream(arrayOfSheeps).filter(s -> Boolean.TRUE.equals(s)).count();
    }

    public static class CounterTest {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        @Test
        public void test() {
            assertEquals("There are 17 sheeps in total",
                    17, new CountingSheep().countSheeps(array1));
        }
    }
}
