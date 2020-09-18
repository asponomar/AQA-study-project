package epam_jdi_page.tests;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import epam_jdi_page.steps.ActionSteps;
import epam_jdi_page.steps.AssertionSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class AbstractBaseTest implements TestData {
    protected ActionSteps actionStep;
    protected AssertionSteps assertStep;

/*    @BeforeSuite
    public void suiteSetup() {


//        Creating WebDriver from file without BoniGarcia WebDriverManager
*//*        System.setProperty("webdriver.gecko.driver", this
                .getClass()
                .getClassLoader().getResource("drivers/geckodriver")
                .getPath());

        System.setProperty("webdriver.chrome.driver", this
                .getClass()
                .getClassLoader().getResource("drivers/chromedriver")
                .getPath());*//*

//        FIXME Trying to create ChromeDriver gives error in Linux
*//*        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model*//*
    }*/

    @BeforeTest
    public void setUp() {
        Configuration.browser = Browsers.FIREFOX;
        Configuration.timeout = 2000;
        Configuration.assertionMode = AssertionMode.STRICT;
        Configuration.startMaximized = true;
        Configuration.screenshots = false;
    }

    @BeforeMethod
    public void methodSetUp(){
        open(HOME_PAGE_URL);
        this.actionStep = new ActionSteps();
        this.assertStep = new AssertionSteps();
    }


}
