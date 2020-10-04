package epam_jdi_page.steps;

import epam_jdi_page.page_objects.DifferentElementsPage;
import epam_jdi_page.page_objects.HomePage;
import epam_jdi_page.page_objects.MetalColorsPage;
import epam_jdi_page.page_objects.TablePages;
import epam_jdi_page.components.Footer;
import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.NavigationSideBar;
import epam_jdi_page.components.RightSidebar;

public class AbstractBaseSteps {
    protected HeaderMenu headerMenu;
    protected NavigationSideBar navigationSideBar;
    protected Footer footer;

    protected RightSidebar rightSidebar;

    protected HomePage homePage;
    protected DifferentElementsPage differentElementsPage;
    protected MetalColorsPage metalColorsPage;
    protected TablePages tablePages;

    public AbstractBaseSteps() {
        this.headerMenu = new HeaderMenu();
        this.navigationSideBar = new NavigationSideBar();
        this.footer = new Footer();

        this.rightSidebar = new RightSidebar();

        this.homePage = new HomePage();
        this.differentElementsPage = new DifferentElementsPage();
        this.metalColorsPage = new MetalColorsPage();
        this.tablePages = new TablePages();

    }
}
