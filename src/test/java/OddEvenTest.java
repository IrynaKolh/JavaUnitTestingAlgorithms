import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
//        AAA pattern
//        Arrange (first test part with known data -> expected result)
//        Act (second part - invoke method which need to test -> actual result)
//        Assert (last part - compare expected result with actual result -> pass/fail test)
//        TastNg -> actualResult.assert(expectedResult)
//        JUnit -> expectedResult.assert(actualResult)

    // тестовый сценарий - мы будем передавать четное число и мы ожидаем получить String "Even"
    @Test
    public void testEvenHP(){
        int number = 2;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZeroHP(){
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать 0 и мы ожидаем получить String "Even"
    @Test
    public void testOddHP(){
        int number = 5;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать нечетное число и мы ожидаем получить String "Odd"
    @Test
    public void testStringNegativeHP() {
        String  number = "-3";
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать негативное четное и мы ожидаем получить String "Even"
    @Test
    public void testNegativeEvenHP() {
        int number = -2;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать негативное нечетное и мы ожидаем получить String "Odd"
    @Test
    public void testNegativeOddHP() {
        int number = -3;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать позитивное число out of int range и мы ожидаем получить String "Odd"
    @Test
    public void testPositiveOutOfRangeEvenHappyPath() {
        int number = Integer.MAX_VALUE + 1;

        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringEvenHP() {
        String number = "2";
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать нечетное число и мы ожидаем получить String "Odd"
    @Test
    public void testStringOddHP() {
        String number = "3";
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать 0 и мы ожидаем получить String "Even"
    @Test
    public void testStringZeroHP() {
        String number = "0";
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать негативное четное и мы ожидаем получить String "Even"
    @Test
    public void testStringNegativeEvenHP() {
        String number = "-2";
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать негативное нечетное и мы ожидаем получить String "Odd"
    @Test
    public void testStringNegativeOddHP() {
        String number = "-3";
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // ТЕСТИРОВАНИЕ ОШИБОК

    // тестовый сценарий - мы будем передавать пустую строку и мы ожидаем получить String "Empty Data. Please input valid number."
    @Test
    public void testEmptyStringShowsError() {
        String  number = "";
        String expectedResult = "Empty Data. Please input valid number.";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать строку "2147483648" и мы ожидаем получить String "Out of range Data. Please input valid number."
    @Test
    public void testOutOfRange () {
        String number = "2147483648";

        String expectedResult = "Out of range Data. Please input valid number.";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать строку "214748a" и мы ожидаем получить String "Non-numeric data. Please input valid number."
    @Test
    public void testInvalidString () {
        String number = "21474a";

        String expectedResult = "Non-numeric data. Please input valid number.";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // тестовый сценарий - мы будем передавать null и мы ожидаем получить String "Server error. Try again later..."
    @Test
    public void testNull() {
        String number = null;

        String expectedResult = "Server error. Try again later...";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
