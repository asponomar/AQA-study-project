package epam_jdi_page.items.different_elements_page;

import java.util.ArrayList;
import java.util.List;

public enum Checkboxes {
    WATER("Water"),
    EARTH("Earth"),
    WIND("Wind"),
    FIRE("Fire");

    private final String checkboxName;

    Checkboxes(String checkboxName) {
        this.checkboxName = checkboxName;
    }

    public static List<String> getCheckboxesNames() {
        ArrayList<String> result = new ArrayList<>();
        for (Checkboxes checkbox : values()) {
            result.add(checkbox.checkboxName);
        }
        return result;
    }

    public String getCheckboxName() {
        return checkboxName;
    }
}
