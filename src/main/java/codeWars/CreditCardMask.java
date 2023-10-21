package codeWars;

public class CreditCardMask {

    public static String maskify(String str) {
        if (str.length() < 5) return str;
        String str2 = str.substring(str.length() - 4);
        return "#".repeat(str.length() - 4) + str2;
    }

    public static void main(String[] args) {
        System.out.println(maskify("1234567"));
    }
}
