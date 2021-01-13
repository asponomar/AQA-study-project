package epam_jdi_page.tests;

import epam_jdi_page.items.HeaderMenuItems;
import epam_jdi_page.items.NavigationSidebarMenuItems;
import epam_jdi_page.items.different_elements_page.Checkboxes;
import epam_jdi_page.items.different_elements_page.DropdownColors;
import org.testng.annotations.Test;

import static epam_jdi_page.items.ServiceMenuItems.DIFFERENT_ELEMENTS;
import static epam_jdi_page.items.ServiceMenuItems.getServiceMenuItems;
import static epam_jdi_page.items.different_elements_page.Radios.SELEN;

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

//  TODO The test is flaky, to fix it add a condition of clicking Service in Menus: if Service clicked or not

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

//        11. Select checkboxes Water, Wind and check its selection
        actionStep.selectCheckbox(Checkboxes.WATER);
        actionStep.selectCheckbox(Checkboxes.WIND);
        assertStep.checkboxShouldBeSelected(Checkboxes.WATER);
        assertStep.checkboxShouldBeSelected(Checkboxes.WIND);

//        12. Assert that for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        assertStep.checkboxesLogRowCheck();

//        13. Select radio Selen
        actionStep.selectRadio(SELEN);
        assertStep.radioShouldBeSelected(SELEN);

//        14. Assert that for radiobutton there is a log row and value is corresponded to the status of radiobutton
        assertStep.radiosLogRowCheck();

//        15. Select in dropdown Yellow
        actionStep.selectDropdownColor(DropdownColors.YELLOW);
        assertStep.dropdownColorShouldBeSelected(DropdownColors.YELLOW);

//        16. Assert that for dropdown there is a log row and value is corresponded to the selected value
        assertStep.colorsLogRowCheck();

        actionStep.logout();
    }
}
