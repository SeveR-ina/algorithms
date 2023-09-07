package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDifferenceOfTwoArrays {
    //https://leetcode.com/problems/find-the-difference-of-two-arrays
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) map1.put(nums1[i], map1.get(nums1[i]) + 1);
            else map1.put(nums1[i], 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (map2.containsKey(nums2[j])) map2.put(nums2[j], map2.get(nums2[j]) + 1);
            else map2.put(nums2[j], 1);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (var entry1 : map1.entrySet()) {
            if (!map2.containsKey(entry1.getKey())) list1.add(entry1.getKey());
        }
        for (var entry2 : map2.entrySet()) {
            if (!map1.containsKey(entry2.getKey())) list2.add(entry2.getKey());
        }
        return Arrays.asList(list1, list2);
    }
}
