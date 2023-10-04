package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

//https://www.codewars.com/kata/5266876b8f4bf2da9b000362

/**
 * Task
 * Implement the function which takes an array containing the names of people that like an item.
 * It must return the display text as shown in the examples:
 * <p>
 * Examples:
 * <p>
 * []                                -->  "no one likes this"
 * <p>
 * ["Peter"]                         -->  "Peter likes this"
 * <p>
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * <p>
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * <p>
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 */
@RunWith(Enclosed.class)
public class WhoLikesIt {

    public static String whoLikesIt(String... names) {

        if (names.length == 1) return names[0] + " likes this";

        if (names.length == 2) return names[0] + " and " + names[1] + " like this";

        if (names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";

        if (names.length > 3) return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

        return "no one likes this";
    }

    public static class WhoLikesItTest {
        @Test
        public void staticTests() {
            assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
            assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
            assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
            assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
            assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        }
    }

}
