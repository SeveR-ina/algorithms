package streamApi;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Enclosed.class)
public class SquaresOfOddNumbers {
    /**
     * You have a collection of integers. Return the collection of doubles which includes square roots of each element.
     */
    private static List<Double> result(List<Integer> numbers) {

        return numbers
                .stream()
                .mapToDouble(Math::sqrt)
                .boxed()
                .collect(Collectors.toList());
    }

    public static class Tests {
        @Test
        public void findResult() {

            List<Double> result1 = SquaresOfOddNumbers.result(List.of(1, 2, 3, 4, 5));

            Double[] actual1 = result1.toArray(new Double[0]); // Convert the result1 list to an array for comparison

            assertArrayEquals(new Double[]{1.0, 1.4142135623730951, 1.7320508075688772, 2.0, 2.23606797749979}, actual1); // Use assertArrayEquals to compare the arrays
        }
    }

    public static void main(String[] args) {
        JUnitCore.main(SquaresOfOddNumbers.Tests.class.getName());
    }
}
