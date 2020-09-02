package epam_jdi_page_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class AbstractBaseTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();

/*        System.setProperty("webdriver.gecko.driver", this
                .getClass()
                .getClassLoader().getResource("drivers/geckodriver")
                .getPath());*/

/*        System.setProperty("webdriver.chrome.driver", this
                .getClass()
                .getClassLoader().getResource("drivers/chromedriver")
                .getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model*/

        this.driver = new FirefoxDriver();
//        Implicit wait of appearing of page elements
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        Implicit wait of page loading
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
//        Implicit wait of script loading
        driver.manage().timeouts().setScriptTimeout(3000, TimeUnit.MILLISECONDS);
    }
}
