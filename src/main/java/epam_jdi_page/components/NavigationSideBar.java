package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;
import epam_jdi_page.items.NavigationSidebarMenuItems;
import epam_jdi_page.items.ServiceMenuItems;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.name;
import static org.openqa.selenium.By.xpath;

public class NavigationSideBar {

    private final List<SelenideElement> navigationBarMenu = $$(".sidebar-menu>li");

    private final SelenideElement navigationSidebar = $(name("navigation-sidebar"));

    private final List<SelenideElement> serviceMenuItems =
            $$(xpath("//div[@class='wrapper']//li[3]//ul[1]//*[contains(@ui, 'label')]"));


    public SelenideElement getNavigationSidebar() {
        return navigationSidebar;
    }

    public List<SelenideElement> getNavigationBarMenu() {
        return navigationBarMenu;
    }

    public List<SelenideElement> getServiceMenuItems() {
        return serviceMenuItems;
    }

    public void navigationSidebarMenuClick(NavigationSidebarMenuItems menuItemToClick) {
        for (SelenideElement menuItem : navigationBarMenu) {
            if (menuItemToClick.getItemName().equalsIgnoreCase(menuItem.getText())) {
                menuItem.click();
                break;
            }
        }
    }

    public void serviceItemSidebarMenuClick(ServiceMenuItems serviceItem) {
        try {
            for (SelenideElement item : serviceMenuItems) {
                if (item.getText().equals(serviceItem.getItemName())) {
                    item.click();
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            serviceItemSidebarMenuClick(serviceItem);
        }
    }
}


