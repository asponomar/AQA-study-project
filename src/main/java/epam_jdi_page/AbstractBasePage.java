package epam_jdi_page;

import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.LeftSideBarMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractBasePage {
    protected WebDriver driver;
    private HeaderMenu headerMenu;
    private LeftSideBarMenu leftSideBarMenu;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        headerMenu = new HeaderMenu(driver);
        leftSideBarMenu = new LeftSideBarMenu(driver);
    }

    public void open(String url) {
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
