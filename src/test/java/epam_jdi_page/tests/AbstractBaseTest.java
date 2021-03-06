package epam_jdi_page.tests;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import epam_jdi_page.listeners.AttachmentListener;
import epam_jdi_page.steps.ActionSteps;
import epam_jdi_page.steps.AssertionSteps;
import epam_jdi_page.utils.User;
import io.qameta.allure.Step;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;

@Listeners({AllureTestNg.class, AttachmentListener.class})
public class AbstractBaseTest implements TestData {
    protected ActionSteps actionStep;
    protected AssertionSteps assertStep;
    protected User user;

    @BeforeTest
    public void setUp() throws MalformedURLException {
//        DriverClass.initRemoteDriver();

        Configuration.browser = Browsers.FIREFOX;
        Configuration.timeout = 2000;
        Configuration.assertionMode = AssertionMode.STRICT;
        Configuration.startMaximized = true;
        Configuration.screenshots = false;
        Configuration.headless = false;
    }

    @BeforeMethod
    @Step("I open EPAM JDI Home Page")
    public void methodSetUp() {
        open(HOME_PAGE_URL);
        this.actionStep = new ActionSteps();
        this.assertStep = new AssertionSteps();
        this.user = User.createUserFromPropertyFile(PROPERTY_FILE);
    }

/*    @AfterMethod
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }*/
}
