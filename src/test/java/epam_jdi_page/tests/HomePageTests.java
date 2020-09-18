package epam_jdi_page.tests;

import org.testng.annotations.Test;

import static epam_jdi_page.components.items.BenefitTextItems.getBenefitTextItems;
import static epam_jdi_page.components.items.HeaderMenuItems.getHeaderMenuItems;

public class HomePageTests extends AbstractBaseTest implements TestData {

    @Test
    public void homePageTest() {

        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

        actionStep.login(USER_LOGIN, USER_PASSWORD);
        assertStep.userNameShouldBe(USER_NAME);
        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());

        assertStep.benefitIconsShouldBeDisplayed();

        assertStep.benefitTextsShouldBe(getBenefitTextItems());

        assertStep.mainTitleTextShouldBe(MAIN_TITLE_TEXT);
        assertStep.jdiTextShouldBe(JDI_TEXT);

        assertStep.iFrameshouldExist();
        actionStep.switchToIframe();
        assertStep.epamLogoShouldBeDisplayed();
        actionStep.switchToParentFrame();

        assertStep.epamLogoShouldBeDisplayed();

        assertStep.jdiGithubLinkIsDisplayed();
        assertStep.jdiGithubLinkTextShouldBe(JDI_GITHUB_LINK_NAME);
        assertStep.jdiGitHubLinkSHouldBe(JDI_GITHUB_LINK_URL);

        assertStep.navigationBarisDisplayed();
        assertStep.footerIsDisplayed();

        assertStep.assertAll();

    }
}
