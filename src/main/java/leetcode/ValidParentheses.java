package leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/**
 * Problem:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 */

public class ValidParentheses {
    //https://leetcode.com/problems/valid-parentheses/
    public static boolean isValid(@NotNull String s) {
        int l = s.length();
        if (l % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                Character top = stack.peek();
                if (ch == ')' && top == '(') {
                    stack.pop();
                } else if (ch == ']' && top == '[') {
                    stack.pop();
                } else if (ch == '}' && top == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){}}{";
        boolean result = isValid(s);
        System.out.println(result);
    }
}
