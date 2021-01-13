package epam_jdi_page.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import epam_jdi_page.items.HeaderMenuItems;
import epam_jdi_page.items.NavigationSidebarMenuItems;
import epam_jdi_page.items.ServiceMenuItems;
import epam_jdi_page.utils.User;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class ActionSteps extends AbstractBaseSteps {

    // COMMON STEPS
    @Step("I open '{0}' url")
    public void openPageUrl(String pageURL) {
        open(pageURL);
    }

    @Step("I login as user from props file")
    public void login(User user) {
        headerMenu.userIconClick();
        headerMenu.setTextUserLoginField(user.getUserLogin());
        headerMenu.setTextUserPasswordField(user.getUserPassword());
        headerMenu.loginButtonClick();
    }

    @Step("I logout")
    public void logout() {
        if (!headerMenu.getLogoutButton().is(Condition.visible)) {
            headerMenu.getUserName().click();
        }
        headerMenu.getLogoutButton().click();
    }


    //HEADER STEPS
    @Step("I click '{0}' item in header navigation menu")
    public void headerNavigationMenuClick(HeaderMenuItems menuItem) {
        headerMenu.headerNavigationMenuItemClick(menuItem);
    }

    @Step("I click '{0}' item in header navigation service submenu")
    public void serviceInHeaderMenuClick(ServiceMenuItems serviceMenuItem) {
        headerMenu.serviceItemHeaderMenuClick(serviceMenuItem);
    }


    //    NAVIGATION SIDEBAR STEPS
    @Step("I click '{0}' item in sidebar menu")
    public void sidevarNavigationMenuClick(NavigationSidebarMenuItems menuItem) {
        navigationSideBar.navigationSidebarMenuClick(menuItem);
    }

    @Step("I click '{0}' item in sidebar service submenu")
    public void serviceInSidebarMenuClick(ServiceMenuItems serviceItem) {
        navigationSideBar.serviceItemSidebarMenuClick(serviceItem);
    }


    // HOMEPAGE STEPS
    @Step("I switch to frame")
    public void switchToIframe() {
        switchTo().frame(homePage.getIFrame());
    }

    @Step("I switch to parent frame")
    public void switchToParentFrame() {
        switchTo().parentFrame();
    }


    //    TABLE PAGES STEPS
    @Step("I choose '{0}' value in entries quantity dropdown menu")
    public void chooseNewEntriesDropdownValue(String newValue) {
        for (SelenideElement value : tablePages.getShowEntriesValues()) {
            if (newValue.equals(value.getValue())) {
                value.click();
                break;
            }
        }
    }

    @Step("I enter '{0}' in text search field")
    public void searchTextInSearchField(String text) {
        tablePages.getSearchField().setValue(text).pressEnter();
    }

}
