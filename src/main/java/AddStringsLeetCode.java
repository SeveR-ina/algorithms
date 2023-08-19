public class AddStringsLeetCode {
    //https://leetcode.com/problems/add-strings/
    public static String addStrings(String num1, String num2) {
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

    public static void main(String[] args) {
        String num1, num2;
        num1 = "11";
        num2 = "123";
        System.out.println(addStrings(num1, num2)); // Output: "134"

        num1 = "456";
        num2 = "77";
        System.out.println(addStrings(num1, num2)); // Output: "533"

        num1 = "0";
        num2 = "0";
        System.out.println(addStrings(num1, num2)); // Output: "0"

        num1 = "99";
        num2 = "99";
        System.out.println(addStrings(num1, num2)); //198
    }
}
