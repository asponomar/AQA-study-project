package epam_jdi_page.listeners;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import static org.openqa.selenium.OutputType.BYTES;

public class AttachmentListener extends TestListenerAdapter {

    @Attachment(value = "{0}", fileExtension = "png", type = "image/png")
    public static byte[] makeScreenShot(String name) {
        byte[] array = null;

        try {
            System.out.println("Make " + name + " screenshot");
            array = ((TakesScreenshot) WebDriverRunner.getWebDriver())
                    .getScreenshotAs(BYTES);
        } catch (WebDriverException e) {
            e.printStackTrace();
        }

        return array;
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        makeScreenShot(tr.getName());
    }
}
