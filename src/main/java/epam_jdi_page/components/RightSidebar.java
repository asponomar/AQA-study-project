package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class RightSidebar {

    private SelenideElement rightSidebar = $(xpath("//div[@name='log-sidebar']"));

    private List<SelenideElement> logList = $$(cssSelector(".panel-body-list.logs li"));

    private List<SelenideElement> resultsList = $$(cssSelector(".panel-body-list.results li"));


    public RightSidebar() {
        page(this);
    }


    public SelenideElement getRightSidebar() {
        return rightSidebar;
    }

    public List<SelenideElement> getLogList() {
        return logList;
    }

    public List<SelenideElement> getResultsList() {
        return resultsList;
    }
}
