package epam_jdi_page.tests;

import epam_jdi_page.items.HeaderMenuItems;
import epam_jdi_page.items.NavigationSidebarMenuItems;
import org.testng.annotations.Test;

import static epam_jdi_page.items.ServiceMenuItems.TABLE_WITH_PAGES;
import static epam_jdi_page.items.ServiceMenuItems.getServiceMenuItems;

public class TablePagesTests extends AbstractBaseTest implements TestData {

    @Test
    public void tablePagesTest() {

        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

        actionStep.login(user);
        assertStep.userNameShouldBe(user.getUserName());

        actionStep.headerNavigationMenuClick(HeaderMenuItems.SERVICE);
        assertStep.serviceMenuItemsInHeaderSHouldBe(getServiceMenuItems());

        actionStep.sidevarNavigationMenuClick(NavigationSidebarMenuItems.SERVICE);
        assertStep.serviceMenuItemsInNavigationBarShouldBe(getServiceMenuItems());

        actionStep.headerNavigationMenuClick(HeaderMenuItems.SERVICE);
        actionStep.serviceInHeaderMenuClick(TABLE_WITH_PAGES);
        assertStep.pageTitleShouldBe(TABLE_PAGES_TITLE);
        assertStep.rightSectionIsDisplayed();
        assertStep.navigationBarisDisplayed();

        assertStep.showEntriesDropdownValueShouldBe("5");
        actionStep.chooseNewEntriesDropdownValue("10");
        assertStep.showEntriesDropdownValueShouldBe("10");
        assertStep.tableShouldHaveSize(10);

        assertStep.tableHeadShouldBe(TABLE_PAGES_TABLE_HEAD);

        actionStep.searchTextInSearchField("Custom");
        assertStep.everyTableElementShouldContainSearchResults("Custom");

        actionStep.logout();
    }
}
