import leetcode.AddBinary;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddBinaryTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"11", "1", "100"},
                {"1010", "1011", "10101"},
                {"1111", "1111", "11110"}
        };
    }

    @Test(dataProvider = "testData", description = "Test adding two binary strings")
    public void testAddBinary(String a, String b, String expected) {
        String result = AddBinary.addBinary(a, b);
        Assert.assertEquals(result, expected, "Actual result " + result + " != " + expected);
    }
}