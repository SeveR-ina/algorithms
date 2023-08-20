package leetcode;

import org.jetbrains.annotations.NotNull;

/**
 * Problem:
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */

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