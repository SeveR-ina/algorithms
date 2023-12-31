package leetcode.hash;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * Problem:
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed
 * by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * <p>
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 */
public class RansomNote {
    //https://leetcode.com/problems/ransom-note/

    public static boolean canConstruct(@NotNull String ransomNote, @NotNull String magazine) {
        int lengthM = magazine.length();
        int lengthNote = ransomNote.length();
        ransomNote = ransomNote.toLowerCase();
        magazine = magazine.toLowerCase();
        if (magazine.contains(ransomNote)) {
            return true;
        } else {
            HashMap<Character, Integer> mag = new HashMap<>();
            for (int i = 0; i < lengthM; i++) {
                char c = magazine.charAt(i);
                if (!mag.containsKey(c)) {
                    mag.put(c, 1);
                } else {
                    mag.put(c, mag.get(c) + 1);
                }
            }
            HashMap<Character, Integer> notes = new HashMap<>();
            for (int i = 0; i < lengthNote; i++) {
                char c = ransomNote.charAt(i);
                if (!notes.containsKey(c)) {
                    notes.put(c, 1);
                } else {
                    notes.put(c, notes.get(c) + 1);
                }
            }
            for (Character c : notes.keySet()) {
                if (!mag.containsKey(c)) return false;
                if (mag.get(c) < notes.get(c)) return false;
                //if (mag.get(c) >= notes.get(c)) return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "Hello";
        String magazine = "enhancingEnglish,languagestransportation,largestores,andshoppingcenters.";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}
