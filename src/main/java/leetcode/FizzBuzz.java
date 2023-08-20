package leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem:
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 */
public class FizzBuzz {
    //https://leetcode.com/problems/fizz-buzz/

    public static @NotNull List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("leetcode.FizzBuzz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else {
                answer.add(i + "");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n;
        List<String> result;

        n = 3;
        result = fizzBuzz(n);
        System.out.println("result = " + result);

        n = 5;
        result = fizzBuzz(n);
        System.out.println("result = " + result);


        n = 15;
        result = fizzBuzz(n);
        System.out.println("result = " + result);
    }
}
