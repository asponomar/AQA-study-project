package calculator.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsCalculator extends AbstractBaseCalculatorTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/unit-tests/junit-tests/SumParameters.csv")
    public void testSum(double a, double b, double expected) {
        System.out.println("Run the Sum Test");
        double actual = calculator.sum(a, b);
        assertEquals(expected, actual, "The sum is fucked up");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/unit-tests/junit-tests/MultParameters.csv")
    public void testMultiply(double a, double b, double expected) {
        System.out.println("Run the Multiply Test");
        double actual = calculator.mult(a, b);
        assertEquals(expected, actual, "Multiply is incorrect");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/unit-tests/junit-tests/DivideParameters.csv")
    public void testDivide(double a, double b, double expected) {
        System.out.println("Run the Divide Test");
        double actual = calculator.div(a, b);
        assertEquals(expected, actual, "Divide and conquer!");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/unit-tests/junit-tests/SubstractParameters.csv")
    public void testSubstract(double a, double b, double expected) {
        System.out.println("Run the Substract Test");
        double actual = calculator.sub(a, b);
        assertEquals(expected, actual, "Don't forget to substract");
    }
}
