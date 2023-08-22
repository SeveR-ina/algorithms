package other;

public class IntegerReversal {
    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        int input = 3956;
        int reversed = reverse(input);
        System.out.println("Reversed Integer: " + reversed);
    }
}
