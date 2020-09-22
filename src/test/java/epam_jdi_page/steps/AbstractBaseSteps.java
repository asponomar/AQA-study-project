package epam_jdi_page.steps;

import epam_jdi_page.HomePage;
import epam_jdi_page.components.Footer;
import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.NavigationSideBar;
import epam_jdi_page.components.RightSidebar;

public class AbstractBaseSteps {
    protected HomePage homePage;
    protected HeaderMenu headerMenu;
    protected NavigationSideBar navigationSideBar;
    protected Footer footer;

    protected RightSidebar rightSidebar;


    public AbstractBaseSteps() {
        this.headerMenu = new HeaderMenu();
        this.navigationSideBar = new NavigationSideBar();
        this.homePage = new HomePage();
        this.footer = new Footer();

        this.rightSidebar = new RightSidebar();
    }
}
