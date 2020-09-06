package epam_jdi_page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class AbstractBaseTest {
    WebDriver driver;

    @BeforeSuite
    public void suiteSetup() {
        WebDriverManager.firefoxdriver().setup();

//        Creating WebDriver from file without BoniGarcia WebDriverManager
/*        System.setProperty("webdriver.gecko.driver", this
                .getClass()
                .getClassLoader().getResource("drivers/geckodriver")
                .getPath());

        System.setProperty("webdriver.chrome.driver", this
                .getClass()
                .getClassLoader().getResource("drivers/chromedriver")
                .getPath());*/

//        FIXME Trying to create ChromeDriver gives error in Linux
/*        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model*/
    }

    @BeforeMethod
    public void setUp() {
        this.driver = new FirefoxDriver();

        driver.manage().window().maximize();
//        Implicit wait of appearing of page elements
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        Implicit wait of page loading
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
//        Implicit wait of script loading
        driver.manage().timeouts().setScriptTimeout(3000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
