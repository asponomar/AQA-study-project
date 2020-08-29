package testng;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {3, 4, 7},
                {45, 50, 95},
                {-80d, 81.5, 1.5}
        };
    }

    @DataProvider
    public Object[][] multiplyDataProvider() {
        return new Object[][]{
                {3, 4, 12},
                {4, 0, 0},
                {-10d, 1.5, -15d}
        };
    }

    @DataProvider
    public Object[][] substractDataProvider() {
        return new Object[][]{
                {3, 4, -1},
                {45, 50, -5},
                {80d, 81.5, -1.5}
        };
    }

    @DataProvider
    public Object[][] divideDataProvider() {
        return new Object[][]{
                {8, 4, 2},
                {5d, -2d, -2.5},
                {110, 10, 11}
        };
    }
}
