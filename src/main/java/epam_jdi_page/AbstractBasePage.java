package epam_jdi_page;

import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.NavigationSideBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractBasePage {
    protected WebDriver driver;
    protected HeaderMenu headerMenu;
    protected NavigationSideBar navigationSideBar;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.headerMenu = new HeaderMenu(driver);
        this.navigationSideBar = new NavigationSideBar(driver);
    }

    public void open(String url) {
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
