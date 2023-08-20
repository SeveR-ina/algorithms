import org.jetbrains.annotations.NotNull;

public class LongestCommonPrefix {
    public static @NotNull String longestCommonPrefix(String @NotNull [] strs) {
        //https://leetcode.com/problems/longest-common-prefix
        int n = strs.length;
        if (n == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < n; i++) {
            String str = strs[i];
            int j = 0;
            while (j < prefix.length() && j < str.length() && prefix.charAt(j) == str.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        if (prefix.isEmpty()) return "";
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"}; //fl
        System.out.println("result = " + longestCommonPrefix(strs));
    }
}
