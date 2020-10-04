package epam_jdi_page.page_objects;

import epam_jdi_page.components.RightSidebar;

public class AbstractBasePageWithRightsideBar extends AbstractBasePage {
    protected RightSidebar rightSidebar;

    public AbstractBasePageWithRightsideBar() {
        this.rightSidebar = new RightSidebar();
    }
}
