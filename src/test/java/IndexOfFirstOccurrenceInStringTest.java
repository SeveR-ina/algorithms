import leetcode.IndexOfFirstOccurrenceInString;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndexOfFirstOccurrenceInStringTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"sadbutsad", "sad", 0},
                {"leetcode", "leeto", -1}
        };
    }

    @Test(dataProvider = "testData", description = "Test the index of the first occurrence of needle in haystack")
    public void testIndexOfFirstOccurrenceInString(String haystack, String needle, int expected) {
        int result = IndexOfFirstOccurrenceInString.strStr(haystack, needle);
        Assert.assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}
