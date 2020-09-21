package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;
import epam_jdi_page.items.HeaderMenuItems;
import epam_jdi_page.items.ServiceItems;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;

public class HeaderMenu {

    private final SelenideElement userIcon = $(id("user-icon"));

    private final SelenideElement userNameField = $(id("name"));

    private final SelenideElement userPassword = $(id("password"));

    private final SelenideElement loginButton = $(id("login-button"));

    private final SelenideElement userName = $(id("user-name"));

    private final SelenideElement logoutButton = $(cssSelector(".logout span"));

    private final List<SelenideElement> headerNavigationMenu = $$(".m-l8>li");

    private final SelenideElement searchIcon = $(className("icon-search"));

    private final SelenideElement searchTextField = $(xpath("//div[@class='search-field']//input"));

    private final List<SelenideElement> serviceDropdownMenu = $$(".dropdown-menu>li>a");


    public HeaderMenu() {
        page(this);
    }


    public void userIconClick() {
        userIcon.click();
    }

    public void setTextUserNameField(String userName) {
        userNameField.sendKeys(userName);
    }

    public void setTextUserPasswordField(String password) {
        userPassword.sendKeys(password);
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public SelenideElement getUserName() {
        return userName;
    }

    public SelenideElement getLogoutButton() {
        return logoutButton;
    }

    public List<SelenideElement> getHeaderNavigationMenuItems() {
        return headerNavigationMenu;
    }

    public void headerNavigationMenuItemClick(HeaderMenuItems menuItem) {
        for (SelenideElement item : headerNavigationMenu) {
            if (item.getText().equals(menuItem.getItemName())) {
                item.click();
                break;
            }
        }
    }

    public List<SelenideElement> getServiceDropdownMenu() {
        return serviceDropdownMenu;
    }

    public void serviceItemClick(ServiceItems serviceItem) {
        try {
            for (SelenideElement item : serviceDropdownMenu) {
                if (item.getText().equals(serviceItem.getItemName())) {
                    item.click();
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            serviceItemClick(serviceItem);
        }
    }

    public void searchIconClick() {
        searchIcon.click();
    }

    public void searchText(String searchText) {
        searchTextField.sendKeys(searchText);
    }

}
