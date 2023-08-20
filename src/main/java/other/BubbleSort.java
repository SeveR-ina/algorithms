package other;

import org.jetbrains.annotations.NotNull;

public class BubbleSort {

    public static void bubbleSort(int @NotNull [] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static StringBuilder returnFormattedArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 1, 4, 2, 6, 3};
        StringBuilder sb1 = returnFormattedArray(arr);
        String initialArray = "Initial array: " + sb1 + ".";
        System.out.println(initialArray);

        bubbleSort(arr);
        StringBuilder sb2 = returnFormattedArray(arr);
        String result = "Sorted array: " + sb2 + ".";
        System.out.println(result);
    }
}