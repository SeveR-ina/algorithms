package leetcode.strings;

import org.jetbrains.annotations.NotNull;

/**
 * Problem:
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
 * You must also not convert the inputs to integers directly.
 * <p>
 * Example 1:
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 */

public class AddStringsLeetCode {
    //https://leetcode.com/problems/add-strings/
    public static @NotNull String addStrings(@NotNull String num1, @NotNull String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? Character.getNumericValue(num1.charAt(i)) : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
