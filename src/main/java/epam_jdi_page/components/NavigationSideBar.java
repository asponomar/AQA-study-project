package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.name;

public class NavigationSideBar {

    private final List<SelenideElement> navigationBarMenu = $$(".sidebar-menu>li");

    private final SelenideElement navigationSidebar = $(name("navigation-sidebar"));


    public NavigationSideBar() {
        page(this);
    }


    public SelenideElement getNavigationSidebar() {
        return navigationSidebar;
    }

    public List<SelenideElement> getNavigationBarMenu() {
        return navigationBarMenu;
    }
}


