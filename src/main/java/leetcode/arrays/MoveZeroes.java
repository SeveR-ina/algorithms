package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroes {
    /**
     * Problem:
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     * <p>
     * Example 1:
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */

    //https://leetcode.com/problems/move-zeroes/
    public static int[] moveZeroes(int[] nums) {
        //if (nums.length == 1) return nums;

        List<Integer> list = Arrays.stream(nums)
                .filter(value -> value != 0)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        int zeroSum = nums.length - list.size();

        while (zeroSum > 0) {
            list.add(0);
            zeroSum--;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
