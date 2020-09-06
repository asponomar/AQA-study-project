package epam_jdi_page;

import epam_jdi_page.steps.HomePageActionSteps;
import epam_jdi_page.steps.HomePageAssertionSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends AbstractBaseTest implements TestData {
    HomePageActionSteps actionStep;
    HomePageAssertionSteps assertStep;

    @BeforeMethod
    public void pageSetUp() {
        actionStep = new HomePageActionSteps(driver);
        assertStep = new HomePageAssertionSteps(driver);
    }

    @Test
    public void homePageTest() {
        actionStep.openHomePageUrl(HOME_PAGE_URL);
        assertStep.homePageTitleShouldBe(HOME_PAGE_TITLE);

    }
}
