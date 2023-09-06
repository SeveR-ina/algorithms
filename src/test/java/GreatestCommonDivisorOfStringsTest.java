import leetcode.strings.GreatestCommonDivisorOfStrings;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GreatestCommonDivisorOfStringsTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"ABABAB", "ABAB", "AB"},
                {"LEET", "CODE", ""},
                {"TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXX"}
        };
    }

    @Test(dataProvider = "testData", description = "Test the method that returns the largest string x such that x divides both str1 and str2")
    public void testGreatestCommonDivisorOfStrings(String str1, String str2, String expected) {
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        Assert.assertEquals(result, expected, "Expected: " + expected + ", but got: " + result);
    }
}
