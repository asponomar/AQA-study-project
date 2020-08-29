package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AbstractBaseTest {
    Calculator calculator;

    @BeforeTest
    public void setUp() {
        this.calculator = new Calculator();
    }

    @AfterTest
    public void tearDown() {
        calculator = null;
    }
}
