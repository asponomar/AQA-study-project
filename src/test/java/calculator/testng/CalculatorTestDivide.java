package calculator.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestDivide extends AbstractBaseCalculatorTest {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "divideDataProvider")
    public void testDivide(double a, double b, double expected) {
        System.out.println("Run the Divide Test");
        double actual = calculator.div(a, b);
        assertEquals(actual, expected);
    }
}
