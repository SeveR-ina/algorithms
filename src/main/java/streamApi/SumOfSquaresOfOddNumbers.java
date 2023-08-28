package streamApi;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class SumOfSquaresOfOddNumbers {
    /**
     * You have a collection of integers. Find the sum of the squares of all odd numbers in this collection.
     */
    private static Integer sumOfSquares(List<Integer> numbers) {

        return numbers.stream()
                .filter(number -> number % 2 == 1)
                .mapToInt(i -> i * i)
                .sum();
    }

    public static class Tests {
        @Test
        public void findResult() {
            int result1 = SumOfSquaresOfOddNumbers.sumOfSquares(List.of(1, 2, 3, 4, 5));
            int result2 = SumOfSquaresOfOddNumbers.sumOfSquares(List.of(2, 4, 6, 8, 10));
            int result3 = SumOfSquaresOfOddNumbers.sumOfSquares(List.of(1, 3, 5, 7, 9));
            int result4 = SumOfSquaresOfOddNumbers.sumOfSquares(List.of(0, 2, 4, 6, 8));

            assertEquals(35, result1);
            assertEquals(0, result2);
            assertEquals(165, result3);
            assertEquals(0, result4);
        }
    }

    public static void main(String[] args) {
        JUnitCore.main(SumOfSquaresOfOddNumbers.Tests.class.getName());
    }
}
