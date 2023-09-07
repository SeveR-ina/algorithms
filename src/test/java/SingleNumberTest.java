import leetcode.hash.SingleNumber;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleNumberTest {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{2, 2, 1}, 1},
                {new int[]{4, 1, 2, 1, 2}, 4},
                {new int[]{1}, 1}
        };
    }

    @Test(dataProvider = "testData", description = "Test a method that finds the element that appears once")
    public void testSingleNumber(int[] nums, int expected) {
        int result = SingleNumber.singleNumber(nums);
        Assert.assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}
