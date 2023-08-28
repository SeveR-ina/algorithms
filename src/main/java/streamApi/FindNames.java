package streamApi;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

/**
 * You have a list of strings (for example, people's names). Find all the names
 * that start with the letter "A" and end with the letter "i," and convert them to
 * uppercase.
 */
public class FindNames {

    private static List<String> filterNames(List<String> names) {

        return names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.endsWith("i"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static class Tests {
        @Test
        public void findResult() {
            List<String> result1 = FindNames.filterNames(List.of("Alice", "Bob", "Anna", "David", "Ami", "Ari"));

            String[] actual1 = result1.toArray(new String[0]); // Convert the result1 list to an array for comparison

            assertArrayEquals(new String[]{"AMI", "ARI"}, actual1); // Use assertArrayEquals to compare the arrays
        }
    }

    public static void main(String[] args) {
        JUnitCore.main(FindNames.Tests.class.getName());
    }
}
