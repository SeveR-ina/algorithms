package other;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatcher {
    //https://coderbyte.com/information/Bracket%20Matcher
    public static int BracketMatcher(String str) {
        str = str.replaceAll("[^()]", "");
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        if (chars.length % 2 == 1) return 0;
        for (Character ch : chars) {
            if (ch.equals('(')) {
                stack.push(ch);
            } else {
                if (stack.peek().equals('(')) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) return 1;
        return 0;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcher(s.nextLine()));
    }
}
