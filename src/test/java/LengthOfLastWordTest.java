import leetcode.arrays.LengthOfLastWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LengthOfLastWordTest extends LengthOfLastWord {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"Hello World", 5},
                {"   fly me   to   the moon  ", 4},
                {"luffy is still joyboy", 6}
        };
    }

    @Test(dataProvider = "testData", description = "Test checking the length of the last word in the string")
    public void testLengthOfLastWord(String s, int expected) {
        int result = LengthOfLastWord.lengthOfLastWord(s);
        Assert.assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}
