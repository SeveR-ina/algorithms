package leetcode;

import org.jetbrains.annotations.NotNull;

/**
 * Problem:
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * <p>
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Example 1:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 */

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

