import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBinaryTest extends AddBinary {

    @Test(description = "AddBinary: TC1")
    public void addBinaryTestCaseOne() {
        String a, b, result;
        a = "11";
        b = "1";
        String expected = "100";
        result = addBinary(a, b);
        Assert.assertEquals(result, expected, "Actual result " + result + " != " + expected);
    }

    @Test(description = "AddBinary: TC2")
    public void addBinaryTestCaseTwo() {
        String a, b, result;
        a = "1010";
        b = "1011";
        String expected = "10101";
        result = addBinary(a, b);
        Assert.assertEquals(result, expected, "Actual result " + result + " != " + expected);
    }

    @Test(description = "AddBinary: TC3")
    public void addBinaryTestCaseThree() {
        String a, b, result;
        a = "1111";
        b = "1111";
        String expected = "11110";
        result = addBinary(a, b);
        Assert.assertEquals(result, expected, "Actual result " + result + " != " + expected);
    }
}
