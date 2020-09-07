package epam_jdi_page.components.items;

import java.util.ArrayList;
import java.util.List;

public enum HeaderMenuItems {
    HOME("HOME"),
    CONTACT_FORM("CONTACT FORM"),
    SERVICE("SERVICE"),
    METALS_AND_COLORS("METALS & COLORS");

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
