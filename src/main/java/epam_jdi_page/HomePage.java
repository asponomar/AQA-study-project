package epam_jdi_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractBasePage {


    //        Still don't uderstand how PageFactory works
    public HomePage(WebDriver driver) {
        super(driver);
    }



/*
    public void login(String userName, String userPassword) {
        userIcon.click();
        name.sendKeys(userName);
        password.sendKeys(userPassword);
        loginButton.click();
    }

    public String userNameLabelGetText() {
        return userNameLabel.getText();
    }*/
}
