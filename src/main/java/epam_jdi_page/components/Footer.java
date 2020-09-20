package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class Footer {

    private List<SelenideElement> footerMenu = $$(cssSelector(".footer-menu li"));

    private SelenideElement footerText = $(xpath("//div[contains(text(),'Powered by EPAM System')]"));

    public Footer() {
        page(this);
    }

    public List<SelenideElement> getFooterMenu() {
        return footerMenu;
    }

    public SelenideElement getFooterText() {
        return footerText;
    }
}
