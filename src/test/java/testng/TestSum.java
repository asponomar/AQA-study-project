package testng;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSum extends AbstractBaseTest {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "sumDataProvider")
    public void testSum(double a, double b, double expected) {
        System.out.println("Run the Sum Test");
        double actual = calculator.sum(a,b);
        assertEquals(actual, expected);
    }
}
