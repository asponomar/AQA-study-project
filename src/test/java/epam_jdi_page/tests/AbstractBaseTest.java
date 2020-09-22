package epam_jdi_page.tests;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import epam_jdi_page.steps.ActionSteps;
import epam_jdi_page.steps.AssertionSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class AbstractBaseTest implements TestData {
    protected ActionSteps actionStep;
    protected AssertionSteps assertStep;

    @BeforeTest
    public void setUp() {

        Configuration.browser = Browsers.FIREFOX;
        Configuration.timeout = 2000;
        Configuration.assertionMode = AssertionMode.STRICT;
        Configuration.startMaximized = true;
        Configuration.screenshots = false;
        Configuration.headless = false;

        //        FIXME Trying to create ChromeDriver causes error in Linux: DevToolsActivePort file doesn't exist
/*
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems

        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
*/

    }

    @BeforeMethod
    public void methodSetUp() {
        open(HOME_PAGE_URL);
        this.actionStep = new ActionSteps();
        this.assertStep = new AssertionSteps();
    }


}
