package leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Problem:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 */
public class IsAnagram {
    //https://leetcode.com/problems/valid-anagram/
    public static boolean isAnagram(@NotNull String s, @NotNull String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        boolean result = isAnagram("dadsa", "eqe");
        System.out.println(result);
    }
}
