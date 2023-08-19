import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    //https://leetcode.com/problems/fizz-buzz/

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
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
