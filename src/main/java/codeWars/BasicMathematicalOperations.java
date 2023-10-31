package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Enclosed.class)
public class BasicMathematicalOperations {

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
    }

    public static class BasicMathematicalOperationsTest {
        @Test
        public void testBasics() {
            System.out.println("Basic Tests");
            assertThat(BasicMathematicalOperations.basicMath("+", 4, 7), is(11));
            assertThat(BasicMathematicalOperations.basicMath("-", 15, 18), is(-3));
            assertThat(BasicMathematicalOperations.basicMath("*", 5, 5), is(25));
            assertThat(BasicMathematicalOperations.basicMath("/", 49, 7), is(7));
        }
    }

}
