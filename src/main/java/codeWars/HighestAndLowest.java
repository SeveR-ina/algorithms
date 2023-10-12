package codeWars;


import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * Task
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * <p>
 * Example
 * <p>
 * highAndLow("1 2 3 4 5")  // return "5 1"
 */

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
@RunWith(Enclosed.class)
public class HighestAndLowest {

    public static String highAndLow(String numbers) {

        String[] numbs = numbers.split(" ");

        ArrayList<Integer> list = new ArrayList<>(numbs.length);

        for (String numb : numbs) {
            list.add(Integer.valueOf(numb));
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        return max + " " + min;
    }

    public static class HighestAndLowestTest {
        @Test
        public void test1() {
            assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        }

        @Test
        public void test2() {
            assertEquals("3 1", HighestAndLowest.highAndLow("1 2 3"));
        }
    }
}
