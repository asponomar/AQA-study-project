package epam_jdi_page.driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class DriverClass {

    public static void initRemoteDriver() throws MalformedURLException {
        Configuration.browser = "chrome";
        DesiredCapabilities browser = new DesiredCapabilities();
        browser.setBrowserName("chrome");
        browser.setVersion("78.0");
        browser.setCapability("enableVNC", true);
        WebDriverRunner.setWebDriver(new RemoteWebDriver(URI.create("http://172.17.0.3:4444/wd/hub").toURL(), browser));
        setWebDriver(WebDriverRunner.getWebDriver());
    }
}
