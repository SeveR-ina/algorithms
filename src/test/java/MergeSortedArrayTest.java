import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;

public class MergeSortedArrayTest extends leetcode.MergeSortedArray {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}},
                {new int[]{1}, 1, new int[]{}, 0, new int[]{1}},
                {new int[]{0}, 0, new int[]{1}, 1, new int[]{1}},
                {new int[]{0, 0, 0, 0, 0}, 0, new int[]{1, 2, 3, 4, 5}, 5, new int[]{1, 2, 3, 4, 5}}
        };
    }

    @Test(dataProvider = "testData", description = "Test merging sorted arrays")
    public void testMergeSortedArrays(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        int[] result = merge(nums1, m, nums2, n);
        Assert.assertEquals(result, expected, "Actual result " + Arrays.toString(result) + " != " + Arrays.toString(expected));
    }
}