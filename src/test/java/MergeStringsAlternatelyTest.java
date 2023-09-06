import leetcode.strings.MergeStringsAlternately;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeStringsAlternatelyTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"abc", "pqr", "apbqcr"},
                {"ab", "pqrs", "apbqrs"},
                {"abcd", "pq", "apbqcd"}
        };
    }

    @Test(dataProvider = "testData", description = "Test if two strings word1 and word2 are merged correctly")
    public void testMergeStringsAlternately(String word1, String word2, String expected) {
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        Assert.assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}
