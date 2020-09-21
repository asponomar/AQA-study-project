package epam_jdi_page.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import epam_jdi_page.tests.TestData;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.textsInAnyOrder;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AssertionSteps extends AbstractBaseSteps implements TestData {

    //    COMMON STEPS
    public void pageTitleShouldBe(String pageTitle) {
        $("title").shouldBe(attribute("text", pageTitle));
    }

    public void userNameShouldBe(String userName) {
        headerMenu.getUserName().shouldBe(text(userName));
    }

    public void headerMenuItemsShouldBe(List<String> menuItems) {
        headerMenu.getHeaderNavigationMenuItems().forEach(item -> item.is(visible));
        $$(headerMenu.getHeaderNavigationMenuItems()).shouldHave(textsInAnyOrder(menuItems));
    }

    public void navigationBarisDisplayed() {
        navigationSideBar.getNavigationSidebar().isDisplayed();
    }

    public void footerIsDisplayed() {
        footer.getFooter().isDisplayed();
    }

    public void serviceItemsInHeaderMenuShouldBe(List<String> serviceItems) {
        SoftAssert softAssert = new SoftAssert();
        boolean cond;
        for (SelenideElement item : headerMenu.getServiceDropdownMenu()) {
            cond = serviceItems.contains(item.innerText().toUpperCase().trim());
            item.is(visible);
            softAssert.assertTrue(cond);
        }
        softAssert.assertAll();
    }

    //    HOME PAGE STEPS
    public void benefitIconsShouldBeDisplayed() {
        homePage.getBenefitIcons().forEach(SelenideElement::isDisplayed);
    }

    public void benefitTextsShouldBe(HashMap<Integer, String> texts) {
        int imageCount = 0;
        for (SelenideElement currentBenefitText : homePage.getBenefitTexts()) {
            currentBenefitText.isDisplayed();
            currentBenefitText.shouldBe(Condition.exactText(texts.get(imageCount)));
            imageCount++;
        }
    }

    public void mainTitleTextShouldBe(String titleText) {
        homePage.getMainTitleText().shouldBe(text(titleText));
    }

    public void jdiTextShouldBe(String jdiText) {
        homePage.getJdiText().shouldBe(text(jdiText));
    }

    public void iFrameShouldExist() {
        homePage.getIFrame().exists();
    }

    public void epamLogoShouldBeDisplayed() {
        homePage.getEpamLogo().isDisplayed();
    }

    public void jdiGithubLinkIsDisplayed() {
        homePage.getJdiGithubLink().isDisplayed();
    }

    public void jdiGithubLinkTextShouldBe(String gitHubLinkText) {
        homePage.getJdiGithubLink().shouldBe(text(gitHubLinkText));
    }

    public void jdiGitHubLinkSHouldBe(String link) {
        homePage.getJdiGithubLink().shouldBe(Condition.attribute("href", link));

    }


}

