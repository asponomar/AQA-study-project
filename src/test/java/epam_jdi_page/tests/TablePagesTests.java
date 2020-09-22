package epam_jdi_page.tests;

import org.testng.annotations.Test;

import static epam_jdi_page.items.HeaderMenuItems.SERVICE;
import static epam_jdi_page.items.ServiceMenuItems.TABLE_WITH_PAGES;
import static epam_jdi_page.items.ServiceMenuItems.getServiceMenuItems;

public class TablePagesTests extends AbstractBaseTest implements TestData {

    @Test
    public void tablePagesTest() {

        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

        actionStep.login(USER_LOGIN, USER_PASSWORD);
        assertStep.userNameShouldBe(USER_NAME);

        assertStep.serviceMenuItemsInHeaderSHouldBe(getServiceMenuItems());

        actionStep.headerNavigationMenuClick(SERVICE);
        assertStep.serviceMenuItemsInNavigationBarShouldBe(getServiceMenuItems());

        actionStep.serviceMenuClick(TABLE_WITH_PAGES);
        assertStep.pageTitleShouldBe(TABLE_PAGES_TITLE);
        assertStep.rightSectionIsDisplayed();
        assertStep.navigationBarisDisplayed();

        actionStep.logout();
    }
}
