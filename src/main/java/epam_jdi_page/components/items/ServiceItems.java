package epam_jdi_page.components.items;

import java.util.ArrayList;
import java.util.List;

public enum ServiceItems {
    SUPPORT("SUPPORT"),
    DATES("DATES"),
    SEARCH("SEARCH"),
    COMPLEX_TABLE("COMPLEX TABLE"),
    SIMPLE_TABLE("SIMPLE TABLE"),
    USER_TABLE("USER TABLE"),
    TABLE_WITH_PAGES("TABLE WITH PAGES"),
    DIFFERENT_ELEMENTS("DIFFERENT ELEMENTS");

    private String itemName;

    ServiceItems(String itemName) {
        this.itemName = itemName;
    }

    public static List<String> getServiceItems() {
        ArrayList<String> result = new ArrayList<>();
        for (ServiceItems menuItem : ServiceItems.values()) {
            result.add(menuItem.itemName);
        }
        return result;
    }

    public String getItemName() {
        return itemName;
    }
}
