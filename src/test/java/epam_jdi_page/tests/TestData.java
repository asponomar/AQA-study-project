package epam_jdi_page.tests;

import java.util.Arrays;
import java.util.List;

public interface TestData {
    String PROPERTY_FILE = "src/test/resources/selenide-tests/props.properties";

    String HOME_PAGE_URL = "https://epam.github.io/JDI/index.html";
    String HOME_PAGE_TITLE = "Home Page";

    String DIFFERENT_ELEMENTS_PAGE_TITLE = "Different Elements";

    String TABLE_PAGES_TITLE = "Table with pages";

    String METAL_COLORS_PAGE_TITLE = "Metal and Colors";

    String HOME_PAGE_MAIN_TITLE_TEXT = "EPAM FRAMEWORK WISHES…";
    String HOME_PAGEJDI_TEXT = "LOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISICING ELIT, " +
            "SED DO EIUSMOD TEMPOR INCIDIDUNT UT LABORE ET DOLORE MAGNA ALIQUA. " +
            "UT ENIM AD MINIM VENIAM, QUIS NOSTRUD EXERCITATION ULLAMCO LABORIS NISI " +
            "UT ALIQUIP EX EA COMMODO CONSEQUAT DUIS AUTE IRURE DOLOR IN REPREHENDERIT " +
            "IN VOLUPTATE VELIT ESSE CILLUM DOLORE EU FUGIAT NULLA PARIATUR.";

    String HOME_PAGE_JDI_GITHUB_LINK_NAME = "JDI GITHUB";
    String HOME_PAGE_JDI_GITHUB_LINK_URL = "https://github.com/epam/JDI";

    List<String> TABLE_PAGES_TABLE_HEAD = Arrays.asList("Type", "Now", "Plans");

}
