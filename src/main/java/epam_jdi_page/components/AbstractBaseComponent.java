package epam_jdi_page.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractBaseComponent {
    protected WebDriver driver;

    public AbstractBaseComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
