package epam_jdi_page.steps;

import com.codeborne.selenide.Condition;
import epam_jdi_page.items.HeaderMenuItems;
import epam_jdi_page.items.ServiceItems;
import epam_jdi_page.tests.TestData;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class ActionSteps extends AbstractBaseSteps implements TestData {

    // COMMON STEPS
    public void openPageUrl(String pageURL) {
        open(pageURL);
    }

    public void login(String userName, String userPassword) {
        headerMenu.userIconClick();
        headerMenu.setTextUserNameField(userName);
        headerMenu.setTextUserPasswordField(userPassword);
        headerMenu.loginButtonClick();
    }

    public void logout() {
        if (!headerMenu.getLogoutButton().is(Condition.visible)) {
            headerMenu.getUserName().click();
        }
        headerMenu.getLogoutButton().click();
    }

    public void headerNavigationMenuClick(HeaderMenuItems menuItem) {
        headerMenu.headerNavigationMenuItemClick(menuItem);
    }

    public void serviceMenuClick(ServiceItems serviceItem) {
        headerMenu.serviceItemClick(serviceItem);
    }

    // HOMEPAGE ACTIONS
    public void switchToIframe() {
        switchTo().frame(homePage.getIFrame());
    }

    public void switchToParentFrame() {
        switchTo().parentFrame();
    }

}
