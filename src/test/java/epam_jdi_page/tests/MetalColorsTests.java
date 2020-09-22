package epam_jdi_page.tests;

import epam_jdi_page.items.HeaderMenuItems;
import org.testng.annotations.Test;

public class MetalColorsTests extends AbstractBaseTest {

    @Test
    public void metalColorsTest() {

        assertStep.pageTitleShouldBe(TestData.HOME_PAGE_TITLE);

        actionStep.login(USER_LOGIN, USER_PASSWORD);
        assertStep.userNameShouldBe(USER_NAME);

        actionStep.headerNavigationMenuClick(HeaderMenuItems.METALS_AND_COLORS);
        assertStep.pageTitleShouldBe(TestData.METAL_COLORS_PAGE_TITLE);

        actionStep.logout();
    }
}
