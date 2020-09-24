package epam_jdi_page.items;

import java.util.HashMap;

public enum HomePageBenefitTextItems {
    FIRST_IMAGE_TEXT("To include good practices\n" +
            "and ideas from successful\n" +
            "EPAM project"),
    SECOND_IMAGE_TEXT("To be flexible and\n" +
            "customizable"),
    THIRD_IMAGE_TEXT("To be multiplatform"),
    FOURTH_IMAGE_TEXT("Already have good base\n" +
            "(about 20 internal and\n" +
            "some external projects),\n" +
            "wish to get more…");

    private final String text;

    HomePageBenefitTextItems(String text) {
        this.text = text;
    }

    public static HashMap<Integer, String> getBenefitTextItems() {
        HashMap<Integer, String> result = new HashMap<>();
        int imageCount = 0;
        for (HomePageBenefitTextItems item : values()) {
            result.put(imageCount, item.text);
            imageCount++;
        }
        return result;
    }
}
