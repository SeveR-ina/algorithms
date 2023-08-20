import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/

    public static int @NotNull [] twoSum(int @NotNull [] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, nums[i]);
        }
        int[] result = new int[2];
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            for (int i = 1; i < n; i++) {
                if (entrySet.getKey() == n) i = 0;
                if ((entrySet.getKey() != i) && (entrySet.getValue() + nums[i] == target)) {
                    result[0] = entrySet.getKey();
                    result[1] = i;
                    Arrays.sort(result);
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        // 3, 2, 3 / 6
        // -3, 4, 3, 90 / 0
        // 0, 4, 3, 0 / 0
        // 3, 2, 4 / 6
        int target = 6;
        System.out.println("result = " + Arrays.toString(twoSum(nums, target)));
        twoSum(nums, target);
    }
}
