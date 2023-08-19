public class PalindromeNumber {

    //https://leetcode.com/problems/palindrome-number/
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String firstLetter = number.substring(0, 1);
        int length;
        if (firstLetter.equals("-")) {
            return false;
        } else {
            length = number.length();
        }
        int n = length / 2;
        String partOne = number.substring(0, n);
        String partTwo;
        if (length % 2 == 0) {
            partTwo = number.substring(n, length);
        } else {
            partTwo = number.substring(n + 1, length);
        }
        String result = "";
        char ch;
        for (int i = 0; i < n; i++) {
            ch = partTwo.charAt(i);
            result = ch + result;
        }
        return partOne.equals(result);
    }

    public static boolean isPal(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = -121;
        boolean result1 = isPalindrome(x);
        System.out.println("result 1 = " + result1);

        boolean result2 = isPal(x);
        System.out.println("result 2 = " + result2);
    }
}
