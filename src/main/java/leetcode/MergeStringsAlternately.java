package leetcode;

/**
 * Problem:
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * <p>
 * Example 1:
 * <p>
 * Input: word1 = "abc", word2 = "pqr"
 * <p>
 * Output: "apbqcr"
 * <p>
 * Explanation: The merged string will be merged as so:
 * <p>
 * word1:  a   b   c
 * <p>
 * word2:    p   q   r
 * <p>
 * merged: a p b q c r
 */
public class MergeStringsAlternately {

    //https://leetcode.com/problems/merge-strings-alternately/

    public static String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray(), w2 = word2.toCharArray();
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                sb.append(w1[i]);
                i++;
            }
            if (j < word2.length()) {
                sb.append(w2[j]);
                j++;
            }
        }
        return sb.toString();
    }
}
