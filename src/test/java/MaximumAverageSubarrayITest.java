import leetcode.arrays.MaximumAverageSubarrayI;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MaximumAverageSubarrayITest {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75000},
                {new int[]{5}, 1, 5.00000},
                {new int[]{3, 3, 4, 3, 0}, 3, 3.33333},
                {new int[]{0, 1, 1, 3, 3}, 4, 2.00000}
        };
    }

    @Test(dataProvider = "testData", description = "Test the method that returns max average of array.")
    public void testMaximumAverageSubarrayI(int[] nums, int k, double expected) {
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        Assert.assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}
