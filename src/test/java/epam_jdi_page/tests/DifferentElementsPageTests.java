package epam_jdi_page.tests;

import epam_jdi_page.items.HeaderMenuItems;
import epam_jdi_page.items.NavigationSidebarMenuItems;
import org.testng.annotations.Test;

import static epam_jdi_page.items.HeaderMenuItems.getHeaderMenuItems;
import static epam_jdi_page.items.ServiceMenuItems.DIFFERENT_ELEMENTS;
import static epam_jdi_page.items.ServiceMenuItems.getServiceMenuItems;

public class DifferentElementsPageTests extends AbstractBaseTest {

    @Test
    public void differentElementsPageTest() {

//        1. Open test site by URL
//        2. Assert Browser title
        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

//        3. Perform login
        actionStep.login(user);

//        4. Assert User name
        assertStep.userNameShouldBe(user.getUserName());


        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());

//        5. Click on "Service" subcategory in the header and check that drop down contains needed options
        actionStep.headerNavigationMenuClick(HeaderMenuItems.SERVICE);
        assertStep.serviceMenuItemsInHeaderSHouldBe(getServiceMenuItems());
        actionStep.headerNavigationMenuClick(HeaderMenuItems.SERVICE);

//        6. Click on Service subcategory in the left section and check that drop down contains needed options
        actionStep.sidevarNavigationMenuClick(NavigationSidebarMenuItems.SERVICE);
        assertStep.serviceMenuItemsInNavigationBarShouldBe(getServiceMenuItems());
        actionStep.sidevarNavigationMenuClick(NavigationSidebarMenuItems.SERVICE);

//        7. Open through the header menu Service -> Different Elements Page
        actionStep.headerNavigationMenuClick(HeaderMenuItems.SERVICE);
        actionStep.serviceInHeaderMenuClick(DIFFERENT_ELEMENTS);
        assertStep.pageTitleShouldBe(DIFFERENT_ELEMENTS_PAGE_TITLE);

//        8. Check interface on Different elements page, it contains all needed elements
        assertStep.fourCheckboxesShouldBe();
        assertStep.fourRadiosShouldBe();
        assertStep.twoButtonsShouldBe();
        assertStep.dropdownShouldBe();

//        9. Assert that there is Right Section
        assertStep.rightSectionIsDisplayed();

//        10. Assert that there is Left Section
        assertStep.navigationBarisDisplayed();

        actionStep.logout();
    }
}
