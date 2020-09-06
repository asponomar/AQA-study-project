package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.TestData;
import epam_jdi_page.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageAssertionSteps implements TestData {
    private HomePage homePage;
    private HeaderMenu headerMenu;
//    private HeaderMenuItems headerMenuItems;

    public HomePageAssertionSteps(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public void homePageTitleShouldBe(String homePageTitle) {
        assertEquals(homePage.getPageTitle(), homePageTitle);
    }

    public void userNameShouldBe(String userName) {
        assertEquals(headerMenu.getUserNameText(), userName);
    }

    public void headerMenuItemsShouldBe(List<String> menuItems) {
        for (WebElement menuItem : headerMenu.getHeaderNavigationMenuItems()) {
            assertTrue(menuItem.isDisplayed());
            assertTrue(menuItems.contains(menuItem.getText()));
        }


    }
}
