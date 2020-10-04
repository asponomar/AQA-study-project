package epam_jdi_page.page_objects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.*;

public class HomePage extends AbstractBasePage {

    private final List<SelenideElement> benefitIcons = $$(className("benefit-icon"));

    private final List<SelenideElement> benefitTexts = $$(className("benefit-txt"));

    private final SelenideElement mainTitleText = $(name("main-title"));

    private final SelenideElement jdiText = $(name("jdi-text"));

    private final SelenideElement iFrame = $(id("iframe"));

    private final SelenideElement epamLogo = $(id("epam_logo"));

    private final SelenideElement jdiGithubLink = $(linkText("JDI GITHUB"));


    public List<SelenideElement> getBenefitIcons() {
        return benefitIcons;
    }

    public List<SelenideElement> getBenefitTexts() {
        return benefitTexts;
    }

    public SelenideElement getMainTitleText() {
        return mainTitleText;
    }

    public SelenideElement getJdiText() {
        return jdiText;
    }

    public SelenideElement getIFrame() {
        return iFrame;
    }

    public SelenideElement getEpamLogo() {
        return epamLogo;
    }

    public SelenideElement getJdiGithubLink() {
        return jdiGithubLink;
    }

}

