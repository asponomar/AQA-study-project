package epam_jdi_page;

import epam_jdi_page.components.Footer;
import epam_jdi_page.components.HeaderMenu;
import epam_jdi_page.components.NavigationSideBar;

import static com.codeborne.selenide.Selenide.page;

public class AbstractBasePage {
    protected HeaderMenu headerMenu;
    protected NavigationSideBar navigationSideBar;
    protected Footer footer;

    public AbstractBasePage() {
        page(this);
        this.headerMenu = new HeaderMenu();
        this.navigationSideBar = new NavigationSideBar();
        this.footer = new Footer();
    }
}
