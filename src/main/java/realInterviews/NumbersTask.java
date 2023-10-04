package realInterviews;

import java.util.HashMap;
import java.util.Map;

/**
 * Task
 * Find all numbers can be divided by 3 and count how many times each number is found results and print to logs:
 * <p>
 * <p>
 * Input: int[] = {13, 15, 40, 33, 7, 5, 15, 124, 9, 512, 132, 9, 33, 15}
 * <p>
 * <p>
 * Output:
 * 15: 3
 * 33: 2
 * 9: 2
 * 132: 1
 */

public class NumbersTask {

    public static void main(String[] args) {
        int[] arr = new int[]{13, 15, 40, 33, 7, 5, 15, 124, 9, 512, 132, 9, 33, 15};

        HashMap<Integer, Integer> map = new HashMap<>();

//        int su

        for (Integer i : arr) {
            if (i % 3 == 0) {
                if (map.containsKey(i)) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
