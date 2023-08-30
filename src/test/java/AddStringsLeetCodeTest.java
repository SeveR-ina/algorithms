import leetcode.AddStringsLeetCode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddStringsLeetCodeTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"11", "123", "134"},
                {"0", "0", "0"},
                {"99", "99", "198"}
        };
    }

    @Test(dataProvider = "testData", description = "Test adding two numbers")
    public void testAddStrings(String num1, String num2, String expected) {
        String result = AddStringsLeetCode.addStrings(num1, num2);
        Assert.assertEquals(result, expected, "Actual result " + result + " != " + expected);
    }

    @Test(dataProvider = "testData", description = "Test adding two numbers with Stream Api")
    public void testAddStringsWithStream(String num1, String num2, String expected) {
        String result = leetcode.streamApi.AddStringsLeetCode.addStrings(num1, num2);
        Assert.assertEquals(result, expected, "Actual result " + result + " != " + expected);
    }
}