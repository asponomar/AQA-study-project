package epam_jdi_page.tests;

import epam_jdi_page.items.HeaderMenuItems;
import org.testng.annotations.Test;

import static epam_jdi_page.items.HeaderMenuItems.getHeaderMenuItems;
import static epam_jdi_page.items.ServiceMenuItems.DIFFERENT_ELEMENTS;
import static epam_jdi_page.items.ServiceMenuItems.getServiceMenuItems;

public class DifferentElementsPageTests extends AbstractBaseTest implements TestData {

    @Test
    public void differentElementsPageTest() {

        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

        actionStep.login(user);
        assertStep.userNameShouldBe(user.getUserName());

        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());
        assertStep.serviceMenuItemsInHeaderSHouldBe(getServiceMenuItems());

        actionStep.headerNavigationMenuClick(HeaderMenuItems.SERVICE);
        actionStep.serviceInHeaderMenuClick(DIFFERENT_ELEMENTS);
        assertStep.pageTitleShouldBe(DIFFERENT_ELEMENTS_PAGE_TITLE);

        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());

        actionStep.logout();
    }
}
