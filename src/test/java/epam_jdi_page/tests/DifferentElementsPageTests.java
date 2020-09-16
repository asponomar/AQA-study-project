package epam_jdi_page.tests;

import epam_jdi_page.components.items.HeaderMenuItems;
import epam_jdi_page.components.items.ServiceItems;
import epam_jdi_page.steps.ActionSteps;
import epam_jdi_page.steps.AssertionSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static epam_jdi_page.components.items.HeaderMenuItems.getHeaderMenuItems;
import static epam_jdi_page.components.items.ServiceItems.*;

public class DifferentElementsPageTests extends AbstractBaseTest implements TestData {
    ActionSteps actionStep;
    AssertionSteps assertStep;

    @BeforeMethod
    public void homePageTestSetUp() {
        actionStep = new ActionSteps(driver);
        assertStep = new AssertionSteps(driver);
    }

    @Test
    public void differentElementsPageTest() {

        actionStep.openPageUrl(HOME_PAGE_URL);
        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);
        actionStep.login(USER_LOGIN, USER_PASSWORD);
        assertStep.userNameShouldBe(USER_NAME);

        assertStep.serviceItemsInHeaderMenuShouldBe(getServiceItems());

        actionStep.headerNavigationMenuClick(HeaderMenuItems.SERVICE);
        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());
        actionStep.serviceMenuClick(DIFFERENT_ELEMENTS);
        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());

    }
}
