package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationSideBar {

    private final List<SelenideElement> navigationBarMenu = $$(".sidebar-menu>li");


    public NavigationSideBar() {
        page(this);
    }


    public List<SelenideElement> getNavigationBarMenu() {
        return navigationBarMenu;
    }
}


