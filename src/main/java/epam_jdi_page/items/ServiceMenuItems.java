package epam_jdi_page.items;

import java.util.ArrayList;
import java.util.List;

public enum ServiceMenuItems {
    SUPPORT("SUPPORT"),
    DATES("DATES"),
    SEARCH("SEARCH"),
    COMPLEX_TABLE("COMPLEX TABLE"),
    SIMPLE_TABLE("SIMPLE TABLE"),
    USER_TABLE("USER TABLE"),
    TABLE_WITH_PAGES("TABLE WITH PAGES"),
    DIFFERENT_ELEMENTS("DIFFERENT ELEMENTS"),
    PERFORMANCE("PERFORMANCE");

    private final String itemName;

    ServiceMenuItems(String itemName) {
        this.itemName = itemName;
    }

    public static List<String> getServiceMenuItems() {
        ArrayList<String> result = new ArrayList<>();
        for (ServiceMenuItems menuItem : values()) {
            result.add(menuItem.itemName);
        }
        return result;
    }

    public String getItemName() {
        return itemName;
    }
}
