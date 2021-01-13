package epam_jdi_page.page_objects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.name;

public class DifferentElementsPage extends AbstractBasePageWithRightsideBar {

    private final List<SelenideElement> elementsCheckboxes = $$(".label-checkbox");

    private final List<SelenideElement> metalsRadioButtons = $$(".label-radio");

    private final SelenideElement colorDropdownMenu = $(".colors");

    private final List<SelenideElement> colorOptions = $$(".colors>.uui-form-element>option");

    private final SelenideElement defaultButton = $(name("Default Button"));

    private final SelenideElement button = $("input.uui-button");


    public List<SelenideElement> getElementsCheckboxes() {
        return elementsCheckboxes;
    }

    public List<SelenideElement> getMetalsRadioButtons() {
        return metalsRadioButtons;
    }

    public SelenideElement getColorDropdownMenu() {
        return colorDropdownMenu;
    }

    public List<SelenideElement> getColorOptions() {
        return colorOptions;
    }

    public SelenideElement getDefaultButton() {
        return defaultButton;
    }

    public SelenideElement getButton() {
        return button;
    }
}
