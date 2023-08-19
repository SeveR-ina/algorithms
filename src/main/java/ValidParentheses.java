import java.util.Stack;

public class ValidParentheses {
    //https://leetcode.com/problems/valid-parentheses/
    public static boolean isValid(String s) {
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
