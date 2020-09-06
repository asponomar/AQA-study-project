package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.TestData;
import org.openqa.selenium.WebDriver;

public class HomePageActionSteps implements TestData {
    private HomePage homePage;

    public HomePageActionSteps(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public void openHomePageUrl(String homePageURL) {
        homePage.open(HOME_PAGE_URL);
    }
}
