package epam_jdi_page.items.different_elements_page;

import java.util.ArrayList;
import java.util.List;

public enum Radios {
    GOLD("Gold"),
    SILVER("Silver"),
    BRONZE("Bronze"),
    SELEN("Selen");

    private final String radioName;

    Radios(String radioName) {
        this.radioName = radioName;
    }

    public static List<String> getRadioNames() {
        ArrayList<String> result = new ArrayList<>();
        for (Radios radio : values()) {
            result.add(radio.radioName);
        }
        return result;
    }

    public String getRadioName() {
        return radioName;
    }
}
