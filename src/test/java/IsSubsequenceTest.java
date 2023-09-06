import leetcode.strings.IsSubsequence;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsSubsequenceTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"ace", "abcde", true},
                {"axc", "ahbgdc", false},
                {"", "", true},
                {"ab", "baab", true},
                {"aaaaaa", "bbaaaa", false}
        };
    }

    @Test(dataProvider = "testData", description = "Test checking if one string is subsequence of another")
    public void testIsSubsequence(String s, String t, boolean expected) {
        boolean result = IsSubsequence.isSubsequence(s, t);
        Assert.assertEquals(result, expected, "Actual result for s=" + s + " and t=" + t + " = " + result + " != " + expected);
    }
}