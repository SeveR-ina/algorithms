package leetcode.hash;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    //https://leetcode.com/problems/two-sum/

    public static int @NotNull [] twoSum(int @NotNull [] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }
        return new int[]{}; // No solution found
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target;
        target = 6;
        System.out.println("result = " + Arrays.toString(twoSum(nums, target)));
        nums = new int[]{2, 7, 11, 15};
        target = 17;
        System.out.println("result = " + Arrays.toString(twoSum(nums, target)));
        nums = new int[]{-3, 4, 3, 90};
        target = 0;
        System.out.println("result = " + Arrays.toString(twoSum(nums, target)));
        nums = new int[]{1, 5, 0, 4, 1};
        target = 5;
        System.out.println("result = " + Arrays.toString(twoSum(nums, target)));
    }
}
