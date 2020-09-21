package epam_jdi_page;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.id;

public class TablePages extends AbstractBasePageWithRightsideBar {

    private List<SelenideElement> showEntriesValues = $$(id("table-with-pages_length"));


}
