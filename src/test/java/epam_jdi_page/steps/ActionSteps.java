package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.NavigationSideBar;
import epam_jdi_page.components.items.HeaderMenuItems;
import epam_jdi_page.tests.TestData;
import org.openqa.selenium.WebDriver;

public class ActionSteps implements TestData {
    private HomePage homePage;
    private HeaderMenu headerMenu;
    private NavigationSideBar navigationSideBar;

    public ActionSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
        this.headerMenu = new HeaderMenu(driver);
        this.navigationSideBar = new NavigationSideBar(driver);
    }

    // COMMON STEPS
    public void openPageUrl(String pageURL) {
        homePage.open(pageURL);
    }

    public void login(String userName, String userPassword) {
        headerMenu.userIconClick();
        headerMenu.setTextUserNameField(userName);
        headerMenu.setTextUserPasswordField(userPassword);
        headerMenu.loginButtonClick();
    }

    public void headerNavigationMenuClick(HeaderMenuItems menuItem){
        headerMenu.headerNavigationMenuItemClick(menuItem);
    }

    // HOMEPAGE ACTIONS
    public void switchToIframe() {
        homePage.switchToIFrame();
    }

    public void switchToParentFrame() {
        homePage.switchToParentFrame();
    }

}
