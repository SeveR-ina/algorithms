package leetcode;

import java.util.HashMap;

/**
 * Problem:
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * <p>
 * Output: true
 */
public class IsomorphicStrings {
    //https://leetcode.com/problems/isomorphic-strings

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if sMap already contains a mapping
            if (sMap.containsKey(charS)) {
                if (sMap.get(charS) != charT) {
                    return false; // Mismatch detected
                }
            } else {
                sMap.put(charS, charT);
            }

            // Check if tMap already contains a mapping
            if (tMap.containsKey(charT)) {
                if (tMap.get(charT) != charS) {
                    return false; // Mismatch detected
                }
            } else {
                tMap.put(charT, charS);
            }
        }

        return true; // No mismatches found, strings are isomorphic
    }
}
