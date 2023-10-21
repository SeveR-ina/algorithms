package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

//https://www.codewars.com/kata/5168bb5dfe9a00b126000018/

/**
 * Task
 * Complete the solution so that it reverses the string passed into it.
 * <p>
 * Example:
 * 'world'  =>  'dlrow'
 */
@RunWith(Enclosed.class)
public class ReversedStrings {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static class ReversedStringsTest {
        @Test
        public void sampleTests() {
            assertEquals("dlrow", ReversedStrings.solution("world"));
        }
    }
}


