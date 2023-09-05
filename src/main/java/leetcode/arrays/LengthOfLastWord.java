package leetcode.arrays;

/**
 * Problem:
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Hello World"
 * <p>
 * Output: 5 / Explanation: The last word is "World" with length 5.
 */
public class LengthOfLastWord {
    //https://leetcode.com/problems/length-of-last-word/description
    public static int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        return words[words.length - 1].length();
    }
}
