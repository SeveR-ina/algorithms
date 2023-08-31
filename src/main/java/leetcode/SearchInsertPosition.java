package leetcode;

public class SearchInsertPosition {
    /**
     * Problem:
     * Given a sorted array of distinct integers and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     * <p>
     * Example 1:
     * Input: nums = [1,3,5,6], target = 5
     * <p>
     * Output: 2
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) { // Continue the search as long as the left pointer is less than or equal to the right pointer.
            int mid = left + (right - left) / 2; // Calculate the middle index to split the search range in half.

            if (nums[mid] == target) {
                return mid; // If the middle element is equal to the target, return its index.
            } else if (nums[mid] < target) {
                left = mid + 1; // If the middle element is less than the target, update the left pointer.
            } else {
                right = mid - 1; // If the middle element is greater than the target, update the right pointer.
            }
        }
        // If the loop exits, it means the target is not found in the array.
        // The left pointer now indicates the position where the target should be inserted.
        return left;
    }
}
