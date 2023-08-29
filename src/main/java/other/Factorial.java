package other;

import java.util.*;

public class Factorial {

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(factorial(Integer.parseInt(s.nextLine())));
    }
}
