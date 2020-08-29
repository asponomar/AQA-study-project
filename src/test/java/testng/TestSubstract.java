package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSubstract extends AbstractBaseTest {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "substractDataProvider")
    public void testSubstract(double a, double b, double expected) {
        System.out.println("Run the Substract Test");
        double actual = calculator.sub(a, b);
        assertEquals(actual, expected);
    }
}
