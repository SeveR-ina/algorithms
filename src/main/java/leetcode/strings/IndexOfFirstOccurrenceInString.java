package leetcode.strings;

/**
 * Problem:
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * <p>
 * Output: 0 / Explanation: "sad" occurs at index 0 and 6.The first occurrence is at index 0, so we return 0.
 */
public class IndexOfFirstOccurrenceInString {
    //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
