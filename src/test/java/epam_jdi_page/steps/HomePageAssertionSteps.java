package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.NavigationSideBar;
import epam_jdi_page.tests.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.List;

public class HomePageAssertionSteps implements TestData {
    private HomePage homePage;
    private HeaderMenu headerMenu;
    private NavigationSideBar navigationSideBar;
    private SoftAssert softAssert = new SoftAssert();

    public HomePageAssertionSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
        this.headerMenu = new HeaderMenu(driver);
        this.navigationSideBar = new NavigationSideBar(driver);
    }

    public void homePageTitleShouldBe(String homePageTitle) {
        softAssert.assertEquals(homePage.getPageTitle(), homePageTitle);
    }

    public void userNameShouldBe(String userName) {
        softAssert.assertEquals(headerMenu.getUserNameText(), userName);
    }

    public void headerMenuItemsShouldBe(List<String> menuItems) {
        for (WebElement menuItem : headerMenu.getHeaderNavigationMenuItems()) {
            softAssert.assertTrue(menuItem.isDisplayed(), "Header menu item not displayed, ");
            softAssert.assertTrue(menuItems.contains(menuItem.getText()), "Header menu item not found, ");
        }
    }

    public void benefitIconsShouldBeDisplayed() {
        for (WebElement icon : homePage.getBenefitIcons()) {
            softAssert.assertTrue(icon.isDisplayed(), "Benefit icons not displayed, ");
        }
    }

    public void benefitTextsShouldBe(HashMap<Integer, String> texts) {
        int imageCount = 0;
        for (WebElement text : homePage.getBenefitTexts()) {
            softAssert.assertTrue(text.isDisplayed(), "Benefit text not displayed, ");
            softAssert.assertEquals(text.getText(), texts.get(imageCount), "Benefit text is not equal to ");
            imageCount++;
        }
    }

    //Possible realisation via List of Strings
/*    public void benefitTextsShouldBe(List<String> texts) {
        for (WebElement textElement : homePage.getBenefitTexts()) {
            assertTrue(textElement.isDisplayed());
            assertEquals(textElement.getText(), texts.get(homePage.getBenefitTexts().indexOf(textElement)));
        }
    }*/

    public void mainTitleTextShouldBe(String text) {
        softAssert.assertEquals(homePage.getMainTitleText().getText(), text);
    }

    public void jdiTextShouldBe(String text) {
        softAssert.assertEquals(homePage.getJdiText().getText(), text);
    }

    public void iFrameshouldExist() {
        softAssert.assertTrue(homePage.getiFrame().isDisplayed());
    }

    public void epamLogoShouldBeDisplayed() {
        softAssert.assertTrue(homePage.getEpamLogo().isDisplayed());
    }

    public void jdiGithubLinkIsDisplayed() {
        softAssert.assertTrue(homePage.getJdiGithubLink().isDisplayed());
    }

    public void jdiGithubLinkTextShouldBe(String text) {
        softAssert.assertEquals(homePage.getJdiGithubLink().getText(), text);
    }

    public void jdiGitHubLinkSHouldBe(String link) {
        softAssert.assertEquals(homePage.getJdiGithubLink().getAttribute("href"), link);
    }

    public void navigationBarisDisplayed() {
        softAssert.assertTrue(homePage.getNavigationSidebar().isDisplayed());
    }

    public void footerIsDisplayed() {
        softAssert.assertTrue(homePage.getFooter().isDisplayed());
    }


    public void assertAll() {
        softAssert.assertAll();
    }

}

