import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OddEvenPatamsTest {

    @DataProvider(name = "numberProviderNum")
    public Object[][] numberProviderNum() {
        return new Object[][] {
                {2, "Even"},
                {3, "Odd"},
                {0, "Even"},
                {-2, "Even"},
                {-3, "Odd"},
        };
    }

    @Test(dataProvider = "numberProviderNum")
    public void testOddEven2(int number, String expected) {
        String actualResult = new OddEven().oddEven(number);
        assertEquals(actualResult, expected);
    }

    @DataProvider(name = "numberProviderString")
    public Object[][] numberProviderString() {
        return new Object[][] {
                {"2", "Even"},
                {"3", "Odd"},
                {"0", "Even"},
                {"-2", "Even"},
                {"-3", "Odd"},
                {"", "Empty Data. Please input valid number."},
                {"21474836488456", "Out of range Data. Please input valid number."},
                {"214748a", "Non-numeric data. Please input valid number."},
                {null, "Server error. Try again later..."}
        };
    }

    @Test(dataProvider = "numberProviderString")
    public void testOddEven(String number, String expected) {
        String actualResult = new OddEven().oddEven(number);
        assertEquals(actualResult, expected);
    }
}
