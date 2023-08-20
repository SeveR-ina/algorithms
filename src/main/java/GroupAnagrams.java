import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupAnagrams {
    //https://leetcode.com/problems/group-anagrams/
    public static @NotNull List<List<String>> groupAnagrams(String @NotNull [] strs) {
        List<List<String>> listOfLists = new ArrayList<>();
        int n = strs.length;
        if (n == 1) {
            List<String> innerList2 = Collections.singletonList(strs[0]);
            listOfLists.add(innerList2);
            return listOfLists;
        }
        /*for (int j = 0; j < n - 1; j++) {
            List<String> list = new ArrayList<>();
            char[] ch1 = strs[j].toCharArray();
            Arrays.sort(ch1);
            char[] ch2 = strs[j + 1].toCharArray();
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                list.add(strs[j]);
                list.add(strs[j + 1]);
            }
            listOfLists.add(list);
        }*/
        return listOfLists;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> listOfLists = groupAnagrams(strs);
        System.out.println(listOfLists);
    }
}
