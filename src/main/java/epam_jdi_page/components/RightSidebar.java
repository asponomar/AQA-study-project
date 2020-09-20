package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;
import static org.openqa.selenium.By.cssSelector;

public class RightSidebar {

    private List<SelenideElement> logList = $$(cssSelector(".panel-body-list.logs li"));

    private List<SelenideElement> resultsList = $$(cssSelector(".panel-body-list.results li"));


    public RightSidebar() {
        page(this);
    }


    public List<SelenideElement> getLogList() {
        return logList;
    }

    public List<SelenideElement> getResultsList() {
        return resultsList;
    }
}
