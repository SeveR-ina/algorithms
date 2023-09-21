package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Task
 * You will be given an array of numbers.
 * You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 */

//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
@RunWith(Enclosed.class)
public class SortTheOdd {

    public static int[] sortArray(int[] array) {

        int sum = 0;

        for (Integer i : array) {
            if (i % 2 == 1) sum++;
        }

        if (sum == 0) return array;

        int[] arr2 = new int[sum];

        int j = 0;
        for (int k : array) {
            if (k % 2 == 1) {
                arr2[j] = k;
                j++;
                if (j >= sum) break;
            }
        }

        Arrays.sort(arr2);

        int iterator = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = arr2[iterator];
                iterator++;
                if (iterator >= sum) break;
            }
        }

        return array;
    }

    public static class SolutionTest {

        @Test
        public void exampleTest1() {
            assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, SortTheOdd.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
        }

        @Test
        public void exampleTest2() {
            assertArrayEquals(new int[]{1, 3, 5, 8, 0}, SortTheOdd.sortArray(new int[]{5, 3, 1, 8, 0}));
        }

        @Test
        public void exampleTest3() {
            assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
        }
    }
}

