import leetcode.SearchInsertPosition;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchInsertPositionTest extends SearchInsertPosition {

    @DataProvider(name = "testCases")
    public Object[][] testCases() {
        return new Object[][]{
                {new int[]{1, 3, 5, 6}, 5, 2},
                {new int[]{1, 3, 5, 6}, 2, 1},
                {new int[]{1, 3, 5, 6}, 7, 4}
        };
    }

    @Test(dataProvider = "testCases")
    public void testSearchInsert(int[] nums, int target, int expected) {
        int result = searchInsert(nums, target);
        assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}

