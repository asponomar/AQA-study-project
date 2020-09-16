package epam_jdi_page.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavigationSideBar extends AbstractBaseComponent {

    @FindBy(className = ".sidebar-menu>li")
    private List<WebElement> navigationBarMenu;

    public NavigationSideBar(WebDriver driver) {
        super(driver);
    }
}
