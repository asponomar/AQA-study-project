package epam_jdi_page.components.items;

import java.util.ArrayList;
import java.util.List;

public enum HeaderMenuItems {
    HOME("Home"),
    CONTACT_FORM("Contact Form"),
    SERVICE("Service"),
    METALS_AND_COLORS("Metals & Colors");

    private final String itemName;

    HeaderMenuItems(String itemName) {
        this.itemName = itemName;
    }

    public static List<String> getHeaderMenuItems() {
        ArrayList<String> result = new ArrayList<>();
        for (HeaderMenuItems menuItem : HeaderMenuItems.values()) {
            result.add(menuItem.itemName);
        }
        return result;
    }

    public String getItemName() {
        return itemName;
    }
}
