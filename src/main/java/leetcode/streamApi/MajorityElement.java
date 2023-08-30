package leetcode.streamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MajorityElement {
    //https://leetcode.com/problems/majority-element

    /**
     * Problem:
     * Given an array nums of size n, return the majority element.
     * The majority element is the element that appears more than [n / 2] times. You may assume that the majority element always exists in the array.
     * <p>
     * Example 1:
     * Input: nums = [3,2,3]
     * Output: 3
     */

    public static int majorityElement(int[] nums) {
        // 1. Convert the int array to a Stream of boxed Integers.
        return IntStream.of(nums)
                .boxed()

                // 2. Group elements by their identity (the integers themselves) by other words x -> x and count occurrences.
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

                // 3. Stream the entry set of the map.
                .entrySet().stream()

                // 4. Find the entry with the maximum count using comparingByValue.
                .max(Map.Entry.comparingByValue())

                // 5. Map the result to the key (integer) from the entry or return -1 if the stream is empty.
                .map(Map.Entry::getKey)
                .orElse(-1);
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));

        int[] nums2 = {3, 2, 3};
        System.out.println(majorityElement(nums2));
    }
}
