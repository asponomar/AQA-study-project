package epam_jdi_page.tests;

import epam_jdi_page.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginSeleniumTest extends AbstractBaseTest implements TestData {

    @Test
    public void LoginTest() {

        HomePage homePage = new HomePage(driver);
        homePage.open(HOME_PAGE_URL);
/*        homePage.login("epam", "1234");
        assertEquals(homePage.userNameLabelGetText(), "PITER CHAILOVSKII");*/

/*        driver.get("https://epam.github.io/JDI/index.html");
        driver.findElement(By.id("user-icon")).click();
        driver.findElement(By.id("name")).sendKeys("epam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("login-button")).click();
//        Explicit wait until appearing of user name
        WebElement loginedUserName = new WebDriverWait(driver, 19)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        assertEquals(loginedUserName.getText(), "PITER CHAILOVSKII");
        driver.close();*/


    }
}
