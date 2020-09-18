package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.NavigationSideBar;

public class AbstractBaseSteps {
    protected HomePage homePage;
    protected HeaderMenu headerMenu;
    protected NavigationSideBar navigationSideBar;

    public AbstractBaseSteps() {
        this.headerMenu = new HeaderMenu();
        this.navigationSideBar = new NavigationSideBar();
        this.homePage = new HomePage();
    }
}
