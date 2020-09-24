package epam_jdi_page.page_objects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class TablePages extends AbstractBasePageWithRightsideBar {

    private final List<SelenideElement> showEntriesValues = $$(cssSelector("#table-with-pages_length option"));

    private final SelenideElement currentEntriesValue = $(xpath("//select[@name='table-with-pages_length']"));

    private final List<SelenideElement> tableHead = $$(cssSelector("#table-with-pages thead th"));

    private final List<SelenideElement> tableBody = $$(cssSelector("#table-with-pages tbody tr"));

    private final SelenideElement searchField = $(cssSelector("#table-with-pages_filter input"));


    public List<SelenideElement> getShowEntriesValues() {
        return showEntriesValues;
    }

    public SelenideElement getCurrentEntriesValue() {
        return currentEntriesValue;
    }

    public List<SelenideElement> getTableHead() {
        return tableHead;
    }

    public List<SelenideElement> getTableBody() {
        return tableBody;
    }

    public SelenideElement getSearchField() {
        return searchField;
    }
}
