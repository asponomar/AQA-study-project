package calculator.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestSubstract extends AbstractBaseCalculatorTest {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "substractDataProvider")
    public void testSubstract(double a, double b, double expected) {
        System.out.println("Run the Substract Test");
        double actual = calculator.sub(a, b);
        assertEquals(actual, expected);
    }
}
