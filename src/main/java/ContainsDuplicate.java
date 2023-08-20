import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

public class ContainsDuplicate {
    //https://leetcode.com/problems/contains-duplicate/
    public static boolean containsDuplicate(int @NotNull [] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 1}; //true
        int[] nums = {1, 2, 3, 4}; //false
        System.out.println("result = " + containsDuplicate(nums));
    }
}
