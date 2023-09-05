import leetcode.IsomorphicStrings;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsomorphicStringsTest extends IsomorphicStrings {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"egg", "add", true},
                {"foo", "bar", false},
                {"paper", "title", true},
                {"bbbaaaba", "aaabbbba", false},
                {"a", "a", true},
                {"papap", "titii", false},
                {"ab", "ac", true}
        };
    }

    @Test(dataProvider = "testData", description = "Test if two strings s and t are isomorphic")
    public void testIsomorphicStrings(String s, String t, boolean expected) {
        boolean result = IsomorphicStrings.isIsomorphic(s, t);
        Assert.assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}
