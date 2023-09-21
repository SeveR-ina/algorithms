package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

/**
 * Task
 * Create a function that takes a list of non-negative integers and strings and returns a new list
 * with the strings filtered out.
 * <p>
 * For example,
 * Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
 */

@RunWith(Enclosed.class)
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
//        Pattern pattern = Pattern.compile("\\d+"); // Match one or more digits (non-negative integers)
//        return list
//                .stream()
//                .map(String::valueOf)
//                .filter(pattern.asPredicate())
//                .map(Integer::valueOf) // Convert filtered strings to integers
//                .distinct()
//                .collect(Collectors.toUnmodifiableList());

        return list
                .stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toUnmodifiableList());
    }

    public static class ExampleTests {

        @Test
        public void examples() {
            assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")));
            assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)));
            assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
            assertEquals(List.of(), ListFiltering.filterList(List.of("a", "b", "1")));
        }
    }
}
