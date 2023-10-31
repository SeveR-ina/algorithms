package codeWars;

import java.util.HashMap;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        Double res = 0d;
        HashMap<Double, Integer> map = new HashMap<>();
        for (double v : arr) {
            if (map.containsKey(v)) {
                map.put(v, map.get(v) + 1);
            } else {
                map.put(v, 1);
            }
        }
        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) res = entry.getKey();
        }
        return res;
    }
}
