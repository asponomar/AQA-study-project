package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.TestData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageAssertionSteps implements TestData {
    private HomePage homePage;

    public HomePageAssertionSteps(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public void homePageTitleShouldBe(String homePageTitle) {
        Assert.assertEquals(homePageTitle, HOME_PAGE_TITLE);
    }
}
