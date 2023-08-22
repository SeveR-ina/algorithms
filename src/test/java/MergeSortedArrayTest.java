import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedArrayTest extends leetcode.MergeSortedArray {


    @Test(description = "leetcode.MergeSortedArrayTest: TC1")
    public void mergeSortedArrayTestCaseOne() {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] result = merge(nums1, m, nums2, n);
        Assert.assertEquals(result, expected, "Actual result " + Arrays.toString(result) + " != " + Arrays.toString(expected));
    }

    @Test(description = "leetcode.MergeSortedArrayTest: TC2")
    public void mergeSortedArrayTestCaseTwo() {
        int[] nums1 = {1}, nums2 = {};
        int m = 1, n = 0;
        int[] expected = {1};
        int[] result = merge(nums1, m, nums2, n);
        Assert.assertEquals(result, expected, "Actual result " + Arrays.toString(result) + " != " + Arrays.toString(expected));
    }

    @Test(description = "leetcode.MergeSortedArrayTest: TC3")
    public void mergeSortedArrayTestCaseThree() {
        int[] nums1 = {0}, nums2 = {1};
        int m = 0, n = 1;
        int[] expected = {1};
        int[] result = merge(nums1, m, nums2, n);
        Assert.assertEquals(result, expected, "Actual result " + Arrays.toString(result) + " != " + Arrays.toString(expected));
    }

    @Test(description = "leetcode.MergeSortedArrayTest: TC4")
    public void mergeSortedArrayTestCaseFour() {
        int[] nums1 = {0, 0, 0, 0, 0}, nums2 = {1, 2, 3, 4, 5};
        int m = 0, n = 5;
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = merge(nums1, m, nums2, n);
        Assert.assertEquals(result, expected, "Actual result " + Arrays.toString(result) + " != " + Arrays.toString(expected));
    }
}
