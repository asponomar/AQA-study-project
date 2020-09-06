package epam_jdi_page.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderMenu extends AbstractBaseComponent {

    @FindBy(id = "user-icon")
    public WebElement userIcon;

    @FindBy(id = "name")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement userPassword;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(css = ".m-l8>li")
    public List<WebElement> headerNavigationMenu;

    @FindBy(className = "icon-search")
    public WebElement searchIcon;

    @FindBy(xpath = "//div[@class='search-field']//input")
    public WebElement searchTextField;

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public void userIconClick() {
        userIcon.click();
    }

    public void setTextUserNameField() {
        userNameField.sendKeys("epam");
    }

    public void setTextUserPasswordField() {
        userPassword.sendKeys("1234");
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public void getUserNameText() {
        userName.getText();
    }

    public List<WebElement> getHeaderNavigationMenu() {
        return headerNavigationMenu;
    }

    public void headerNavigationMenuItemClick(String headerMenuItem) {
        for (WebElement headerMenuElement : headerNavigationMenu) {
            if (headerMenuElement.getText().equals(headerMenuItem)) {
                headerMenuElement.click();
            }
        }
    }

    public void searchIconClick() {
        searchIcon.click();
    }

    public void searchText(String searchText) {
        searchTextField.sendKeys(searchText);
    }

}
