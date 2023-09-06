import leetcode.arrays.MoveZeroes;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MoveZeroesTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}},
                {new int[]{0}, new int[]{0}}
        };
    }

    @Test(dataProvider = "testData", description = "Test the method that moves all 0's to the end of the array")
    public void testMoveZeros(int[] nums, int[] expected) {
        int[] result = MoveZeroes.moveZeroes(nums);
        Assert.assertEquals(result, expected, "Expected: " + Arrays.toString(expected) + ", but got: " + Arrays.toString(result));
    }
}
