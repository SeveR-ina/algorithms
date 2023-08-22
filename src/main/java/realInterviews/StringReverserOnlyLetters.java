package realInterviews;

public class StringReverserOnlyLetters {

    public static void main(String[] args) {
        String s1 = "ab-cd";
        String s2 = "absd763274%&%$%$)(*ef";

        System.out.println(reverseString1(s1)); // Output: "dcba"
        System.out.println(reverseString1(s2)); // Output: "fedsba"

        System.out.println(reverseString2(s1)); // Output: "dcba"
        System.out.println(reverseString2(s2)); // Output: "fedsba"
    }

    public static String reverseString1(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                reversed.append(c);
            }
        }
        return reversed.toString();
    }

    public static String reverseString2(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
