import org.jetbrains.annotations.NotNull;

public class IsSubsequence {
    //https://leetcode.com/problems/is-subsequence/
    public boolean isSubsequence(@NotNull String s, @NotNull String t) {
        int sLength = s.length(), tLength = t.length();
        int i = 0;
        for (int j = 0; j < tLength && i < sLength; j++) {
            if (s.charAt(i) == t.charAt(j)) i++;
        }
        return i == sLength;
    }
}