package leetcode.arrays;

import java.text.DecimalFormat;

/**
 * Problem:
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 * Any answer with a calculation error less than 10-5 will be accepted.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * <p>
 * Output: 12.75000
 * <p>
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
//https://leetcode.com/problems/maximum-average-subarray-i/
public class MaximumAverageSubarrayI {
    //TODO: fix solution
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) return Double.parseDouble(new DecimalFormat("#.#####").format(nums[0]));

        double value = 0.0;

        //int[] sortedNums = Arrays.copyOf(nums, nums.length);

        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        String formattedString = decimalFormat.format(value);
        formattedString = formattedString.replaceFirst(",", ".");
        return Double.parseDouble(formattedString);
    }
}
