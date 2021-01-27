package epam_jdi_page.components;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.*;

public class Footer {

    private final SelenideElement footer = $(tagName("footer"));

    private final List<SelenideElement> footerMenu = $$(cssSelector(".footer-menu li"));

    private final SelenideElement footerText = $(xpath("//div[contains(text(),'Powered by EPAM System')]"));


    public SelenideElement getFooter() {
        return footer;
    }

    public List<SelenideElement> getFooterMenu() {
        return footerMenu;
    }

    public SelenideElement getFooterText() {
        return footerText;
    }
}
