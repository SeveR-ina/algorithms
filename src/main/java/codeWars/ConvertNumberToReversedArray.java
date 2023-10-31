package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Enclosed.class)
public class ConvertNumberToReversedArray {

    public static int[] digitize(long n) {
        String temp = n + "";
        int size = temp.length();
        int[] arr = new int[size];
        int i = 0;
        while (n != 0) {
            int num = (int) (n % 10);
            arr[i] = num;
            i++;
            n = n / 10;
        }
        return arr;
    }

    public static class DigitizeExampleTests {
        @Test
        public void tests() {
            assertArrayEquals(new int[]{1, 3, 2, 5, 3}, ConvertNumberToReversedArray.digitize(35231));
            assertArrayEquals(new int[]{0}, ConvertNumberToReversedArray.digitize(0));
        }
    }
}
