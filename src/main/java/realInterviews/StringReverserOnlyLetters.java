package realInterviews;

public class StringReverserOnlyLetters {

    public static void main(String[] args) {
        String s1 = "ab-cd";
        String s2 = "absd763274%&%$%$)(*ef";

        System.out.println(reverseString(s1)); // Output: "dcba"
        System.out.println(reverseString(s2)); // Output: "fedsba"
    }

    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                reversed.append(c);
            }
        }

        return reversed.toString();
    }
}
