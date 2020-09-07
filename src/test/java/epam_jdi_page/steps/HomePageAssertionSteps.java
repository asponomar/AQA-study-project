package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.TestData;
import epam_jdi_page.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.List;

public class HomePageAssertionSteps implements TestData {
    private HomePage homePage;
    private HeaderMenu headerMenu;
    private SoftAssert softAssert = new SoftAssert();
//    private HeaderMenuItems headerMenuItems;

    public HomePageAssertionSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
        this.headerMenu = new HeaderMenu(driver);
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

    public void assertAll() {
        softAssert.assertAll();
    }
//Possible realisation via List of Strings
/*    public void benefitTextsShouldBe(List<String> texts) {
        for (WebElement textElement : homePage.getBenefitTexts()) {
            assertTrue(textElement.isDisplayed());
            assertEquals(textElement.getText(), texts.get(homePage.getBenefitTexts().indexOf(textElement)));
        }
    }*/


}

