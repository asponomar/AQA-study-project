package epam_jdi_page.tests;

import io.qameta.allure.Severity;
import org.testng.annotations.Test;

import static epam_jdi_page.items.HeaderMenuItems.getHeaderMenuItems;
import static epam_jdi_page.items.HomePageBenefitTextItems.getBenefitTextItems;
import static io.qameta.allure.SeverityLevel.CRITICAL;

public class HomePageTests extends AbstractBaseTest implements TestData {

    @Test(testName = "Home page test")
    @Severity(CRITICAL)
    public void homePageTest() {

        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

        actionStep.login(user);
        assertStep.userNameShouldBe(user.getUserName());
        assertStep.pageTitleShouldBe(HOME_PAGE_TITLE);

        assertStep.headerMenuItemsShouldBe(getHeaderMenuItems());

        assertStep.benefitIconsShouldBeDisplayed();

        assertStep.benefitTextsShouldBe(getBenefitTextItems());

        assertStep.mainTitleTextShouldBe(HOME_PAGE_MAIN_TITLE_TEXT);
        assertStep.jdiTextShouldBe(HOME_PAGEJDI_TEXT);

        assertStep.iFrameShouldExist();
        actionStep.switchToIframe();
        assertStep.epamLogoShouldBeDisplayed();
        actionStep.switchToParentFrame();

        assertStep.epamLogoShouldBeDisplayed();

        assertStep.jdiGithubLinkIsDisplayed();
        assertStep.jdiGithubLinkTextShouldBe(HOME_PAGE_JDI_GITHUB_LINK_NAME);
        assertStep.jdiGitHubLinkSHouldBe(HOME_PAGE_JDI_GITHUB_LINK_URL);

        assertStep.navigationBarisDisplayed();
        assertStep.footerIsDisplayed();

        actionStep.logout();
    }
}
