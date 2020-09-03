package epam_jdi_page_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginSeleniumTest extends AbstractBaseTest {

    @Test
    public void LoginTest() {

        driver.get("https://epam.github.io/JDI/index.html");
        driver.findElement(By.id("user-icon")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();
//        Explicit wait until appearing of user name
        WebElement loginedUserName = new WebDriverWait(driver, 19)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        assertEquals(loginedUserName.getText(), "PITER CHAILOVSKII");
        driver.close();


    }
}
