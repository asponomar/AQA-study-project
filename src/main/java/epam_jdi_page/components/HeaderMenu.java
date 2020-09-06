package epam_jdi_page.components;

import epam_jdi_page.components.items.HeaderMenuItems;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderMenu extends AbstractBaseComponent {

    @FindBy(id = "user-icon")
    private WebElement userIcon;

    @FindBy(id = "name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement userPassword;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(css = ".m-l8>li")
    private List<WebElement> headerNavigationMenu;

    @FindBy(className = "icon-search")
    private WebElement searchIcon;

    @FindBy(xpath = "//div[@class='search-field']//input")
    private WebElement searchTextField;

    public HeaderMenu(WebDriver driver) {
        super(driver);
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

    public String getUserNameText() {
        return userName.getText();
    }

    public List<WebElement> getHeaderNavigationMenuItems() {
        return headerNavigationMenu;
    }

    public void headerNavigationMenuItemClick(HeaderMenuItems menuItem) {
        for (WebElement headerMenuElement : headerNavigationMenu) {
            if (headerMenuElement.getText().equals(menuItem.getItemName())) {
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
