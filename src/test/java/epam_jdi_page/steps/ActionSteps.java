package epam_jdi_page.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import epam_jdi_page.items.HeaderMenuItems;
import epam_jdi_page.items.NavigationSidebarMenuItems;
import epam_jdi_page.items.ServiceMenuItems;
import epam_jdi_page.tests.TestData;
import epam_jdi_page.utils.User;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class ActionSteps extends AbstractBaseSteps implements TestData {

    // COMMON STEPS
    public void openPageUrl(String pageURL) {
        open(pageURL);
    }

    public void login(User user) {
        headerMenu.userIconClick();
        headerMenu.setTextUserLoginField(user.getUserLogin());
        headerMenu.setTextUserPasswordField(user.getUserPassword());
        headerMenu.loginButtonClick();
    }

    public void logout() {
        if (!headerMenu.getLogoutButton().is(Condition.visible)) {
            headerMenu.getUserName().click();
        }
        headerMenu.getLogoutButton().click();
    }


    //HEADER STEPS
    public void headerNavigationMenuClick(HeaderMenuItems menuItem) {
        headerMenu.headerNavigationMenuItemClick(menuItem);
    }

    public void serviceInHeaderMenuClick(ServiceMenuItems serviceItem) {
        headerMenu.serviceItemHeaderMenuClick(serviceItem);
    }


    //    NAVIGATION SIDEBAR STEPS
    public void sidevarNavigationMenuClick(NavigationSidebarMenuItems menuItem) {
        navigationSideBar.navigationSidebarMenuClick(menuItem);
    }

    public void serviceInSidebarMenuClick(ServiceMenuItems serviceItem) {
        navigationSideBar.serviceItemSidebarMenuClick(serviceItem);
    }


    // HOMEPAGE STEPS
    public void switchToIframe() {
        switchTo().frame(homePage.getIFrame());
    }

    public void switchToParentFrame() {
        switchTo().parentFrame();
    }


    //    TABLE PAGES STEPS
    public void chooseNewEntriesDropdownValue(String newValue) {
        for (SelenideElement value : tablePages.getShowEntriesValues()) {
            if (newValue.equals(value.getValue())) {
                value.click();
                break;
            }
        }
    }

    public void searchTextInSearchField(String text) {
        tablePages.getSearchField().setValue(text).pressEnter();
    }

}
