package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMultiply extends AbstractBaseTest {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "multiplyDataProvider")
    public void testMultiply(double a, double b, double expected) {
        System.out.println("Run the Multiply Test");
        double actual = calculator.mult(a, b);
        assertEquals(actual, expected);
    }
}
