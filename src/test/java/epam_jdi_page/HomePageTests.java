package epam_jdi_page;

import epam_jdi_page.steps.HomePageActionSteps;
import epam_jdi_page.steps.HomePageAssertionSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static epam_jdi_page.components.items.BenefitTextItems.getBenefitTextItems;
import static epam_jdi_page.components.items.HeaderMenuItems.getHeaderMenuItems;

public class HomePageTests extends AbstractBaseTest implements TestData {
    HomePageActionSteps actionStep;
    HomePageAssertionSteps assertStep;

    @BeforeMethod
    public void homePageTestSetUp() {
        actionStep = new HomePageActionSteps(driver);
        assertStep = new HomePageAssertionSteps(driver);
    }

    @Test
    public void homePageTest() {

        actionStep.openHomePageUrl(HOME_PAGE_URL);
        assertStep.homePageTitleShouldBe(HOME_PAGE_TITLE);

        actionStep.login(USER_LOGIN, USER_PASSWORD);
        assertStep.userNameShouldBe(USER_NAME);
        assertStep.homePageTitleShouldBe(HOME_PAGE_TITLE);

        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());

        assertStep.benefitIconsShouldBeDisplayed();

        assertStep.benefitTextsShouldBe(getBenefitTextItems());



        assertStep.assertAll();

    }
}