package epam_jdi_page.items;

import java.util.ArrayList;
import java.util.List;

public enum NavigationSidebarMenuItems {
    HOME("Home"),
    CONTACT_FORM("Contact Form"),
    SERVICE("Service"),
    METALS_AND_COLORS("Metals & Colors"),
    ELEMENTS_PACKS("Elements Packs");

    private String itemName;

    NavigationSidebarMenuItems(String itemName) {
        this.itemName = itemName;
    }

    public List<String> getNavigationSidebarMenuItems() {
        ArrayList<String> result = new ArrayList<>();
        for (NavigationSidebarMenuItems item : values()) {
            result.add(item.itemName);
        }
        return result;
    }

    public String getItemName() {
        return itemName;
    }
}
