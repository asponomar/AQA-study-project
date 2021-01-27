package epam_jdi_page.items.different_elements_page;

import java.util.ArrayList;
import java.util.List;

public enum DropdownColors {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    YELLOW("Yellow");

    private final String colorName;

    DropdownColors(String colorName) {
        this.colorName = colorName;
    }

    public static List<String> getColorNames() {
        ArrayList<String> result = new ArrayList<>();
        for (DropdownColors color : values()) {
            result.add(color.getColorName());
        }
        return result;
    }

    public String getColorName() {
        return colorName;
    }
}
