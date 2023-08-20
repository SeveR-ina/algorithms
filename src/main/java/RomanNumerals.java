import org.jetbrains.annotations.NotNull;

public class RomanNumerals {
    //https://leetcode.com/problems/roman-to-integer/
    public static int romanToInt(@NotNull String s) {
        int n = s.length();
        int count = 0;
        if (s.contains("IV")) {
            s = s.replace("IV", "");
            count = count + 4;
        }
        if (s.contains("IX")) {
            s = s.replace("IX", "");
            count = count + 9;
        }
        if (s.contains("XL")) {
            s = s.replace("XL", "");
            count = count + 40;
        }
        if (s.contains("XC")) {
            s = s.replace("XC", "");
            count = count + 90;
        }
        if (s.contains("CD")) {
            s = s.replace("CD", "");
            count = count + 400;
        }
        if (s.contains("CM")) {
            s = s.replace("CM", "");
            count = count + 900;
        }
        for (int i = 0; i < n; i++) {
            if (s.contains("I")) {
                s = s.replaceFirst("I", "");
                count = count + 1;
            }
            if (s.contains("V")) {
                s = s.replaceFirst("V", "");
                count = count + 5;
            }
            if (s.contains("X")) {
                s = s.replaceFirst("X", "");
                count = count + 10;
            }
            if (s.contains("L")) {
                s = s.replaceFirst("L", "");
                count = count + 50;
            }
            if (s.contains("C")) {
                s = s.replaceFirst("C", "");
                count = count + 100;
            }
            if (s.contains("D")) {
                s = s.replaceFirst("D", "");
                count = count + 500;
            }
            if (s.contains("M")) {
                s = s.replaceFirst("M", "");
                count = count + 1000;
            }
        }
        //System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println("result = " + romanToInt("LVIII")); // 58
        System.out.println("result = " + romanToInt("MCMXCIV")); // 1994
        System.out.println("result = " + romanToInt("III")); //3
    }
}

