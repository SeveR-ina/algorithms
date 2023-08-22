package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxInArray {

    public static void main(String[] args) {
        int[] array = {5, 12, 9, 18, 3, 21};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update maximum value
            }
            if (array[i] < min) {
                min = array[i]; // Update minimum value
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);


        int[] array2 = {4, 7, 2, 9, 5};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>(array2.length);
        for (int value : array2) {
            list.add(value);
        }

        // Find the minimum and maximum values
        int min2 = Collections.min(list);
        int max2 = Collections.max(list);

        System.out.println("Minimum value: " + min2);
        System.out.println("Maximum value: " + max2);
    }
}
