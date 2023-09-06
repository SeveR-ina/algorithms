package leetcode.strings;

/**
 * Problem:
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 * Example 1:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 */
public class GreatestCommonDivisorOfStrings {
    //https://leetcode.com/problems/greatest-common-divisor-of-strings
//TODO: fix the solution
    public static String gcdOfStrings(String str1, String str2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < Math.min(str1.length(), str2.length())) {
            if (str1.charAt(i) == str2.charAt(i)) {
                if (str1.charAt(i + 1) != str1.charAt(0)) {
                    sb.append(str1.charAt(i));
                }
            }
            i++;
        }
        return sb.toString();
    }
}
