package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.name;
import static org.openqa.selenium.By.xpath;

public class NavigationSideBar {

    private final List<SelenideElement> navigationBarMenu = $$(".sidebar-menu>li");

    private final SelenideElement navigationSidebar = $(name("navigation-sidebar"));

    private final List<SelenideElement> serviceMenuItems =
            $$(xpath("//div[@class='wrapper']//li[3]//ul[1]//*[contains(@ui, 'label')]"));


    public NavigationSideBar() {
        page(this);
    }


    public SelenideElement getNavigationSidebar() {
        return navigationSidebar;
    }

    public List<SelenideElement> getNavigationBarMenu() {
        return navigationBarMenu;
    }

    public List<SelenideElement> getServiceMenuItems() {
        return serviceMenuItems;
    }
}


