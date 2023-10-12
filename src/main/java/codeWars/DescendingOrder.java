package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;


//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/java

/**
 * Task
 * Your task is to make a function that can take any non-negative integer as an argument and return it
 * with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 * <p>
 * Example
 * <p>
 * Input: 42145 Output: 54421
 */
@RunWith(Enclosed.class)
public class DescendingOrder {

    public static int sortDesc(final int num) {

        StringBuilder sb = new StringBuilder();

        int num2 = num;

        int length = String.valueOf(num).length();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            int n = num2 % 10;
            arr[i] = n;
            num2 = num2 / 10;
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return Integer.parseInt(sb.toString());
    }

    public static int sortDescStreamApi(final int num) {

        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    public static class DescendingOrderTest {

        @Test
        public void test_01() {
            assertEquals(0, DescendingOrder.sortDesc(0));
        }

        @Test
        public void test_02() {
            assertEquals(51, DescendingOrder.sortDesc(15));
        }


        @Test
        public void test_03() {
            assertEquals(987654321, DescendingOrder.sortDesc(123456789));
        }

        @Test
        public void test_04() {
            assertEquals(2110, DescendingOrder.sortDesc(1021));
        }

        @Test
        public void test_05() {
            assertEquals(0, DescendingOrder.sortDescStreamApi(0));
        }

        @Test
        public void test_06() {
            assertEquals(51, DescendingOrder.sortDescStreamApi(15));
        }


        @Test
        public void test_07() {
            assertEquals(987654321, DescendingOrder.sortDescStreamApi(123456789));
        }

        @Test
        public void test_08() {
            assertEquals(2110, DescendingOrder.sortDescStreamApi(1021));
        }
    }
}
