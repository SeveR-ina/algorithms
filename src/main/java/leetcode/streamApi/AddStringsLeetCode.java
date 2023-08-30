package leetcode.streamApi;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

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
        StringBuilder result = new StringBuilder();
        final int[] carry = {0};

        // Use IntStream.range to iterate over the indices from right to left.
        IntStream.range(0, Math.max(num1.length(), num2.length()))
                .mapToObj(i -> {
                    // Get the individual digits from the right side, or 0 if no more digits.
                    int n1 = i < num1.length() ? num1.charAt(num1.length() - i - 1) - '0' : 0;
                    int n2 = i < num2.length() ? num2.charAt(num2.length() - i - 1) - '0' : 0;
                    // Calculate the sum of digits and any carry-over.
                    int sum = n1 + n2 + carry[0];
                    // Update the carry for the next iteration.
                    carry[0] = sum / 10;
                    // Return the digit to be appended to the result.
                    return sum % 10;
                })
                .forEach(result::append);

        // If there is a carry left after the loop, append it to the result.
        if (carry[0] > 0) {
            result.append(carry[0]);
        }
        return result.reverse().toString();
    }
}
