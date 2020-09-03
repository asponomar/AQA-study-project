package epam_jdi_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public final String homePageUrl = "https://epam.github.io/JDI/index.html";
    public WebDriver driver;
    @FindBy(id = "user-icon")
    public WebElement userIcon;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(id = "user-name")
    public WebElement userNameLabel;

    public void open() {
        driver.get(homePageUrl);
    }

    public void login(String userName, String userPassword) {
        userIcon.click();
        name.sendKeys(userName);
        password.sendKeys(userPassword);
        loginButton.click();
    }

    public String userNameLabelGetText() {
        return userNameLabel.getText();
    }
}
