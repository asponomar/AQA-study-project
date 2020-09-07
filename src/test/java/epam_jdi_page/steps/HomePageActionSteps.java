package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.TestData;
import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.LeftSideBarMenu;
import org.openqa.selenium.WebDriver;

public class HomePageActionSteps implements TestData {
    private HomePage homePage;
    private HeaderMenu headerMenu;
    private LeftSideBarMenu leftSideBarMenu;

    public HomePageActionSteps(WebDriver driver) {
        this.homePage = new HomePage(driver);
        this.headerMenu = new HeaderMenu(driver);
        this.leftSideBarMenu = new LeftSideBarMenu(driver);
    }

    public void openHomePageUrl(String homePageURL) {
        homePage.open(homePageURL);
    }

    public void login(String userName, String userPassword) {
        headerMenu.userIconClick();
        headerMenu.setTextUserNameField(userName);
        headerMenu.setTextUserPasswordField(userPassword);
        headerMenu.loginButtonClick();
    }
}