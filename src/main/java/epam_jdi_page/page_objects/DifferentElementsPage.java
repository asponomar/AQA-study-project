package epam_jdi_page.page_objects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.name;

public class DifferentElementsPage extends AbstractBasePageWithRightsideBar {

    private final List<SelenideElement> elementsCheckboxes = $$(".label-checkbox");

    private final List<SelenideElement> elementsCheckboxesButtons = $$(".label-checkbox>input");

    private final List<SelenideElement> metalsRadios = $$(".label-radio");

    private final List<SelenideElement> metalsRadioButtons = $$(".label-radio>input");

    private final SelenideElement colorDropdownMenu = $(".colors");

    private final List<SelenideElement> colorDropdownMenuOptions = $$(".colors>.uui-form-element>option");

    private final SelenideElement defaultButton = $(name("Default Button"));

    private final SelenideElement button = $("input.uui-button");


    public List<SelenideElement> getElementsCheckboxes() {
        return elementsCheckboxes;
    }

    public List<SelenideElement> getElementsCheckboxesButtons() {
        return elementsCheckboxesButtons;
    }

    public List<SelenideElement> getMetalsRadios() {
        return metalsRadios;
    }

    public List<SelenideElement> getMetalsRadioButtons() {
        return metalsRadioButtons;
    }

    public SelenideElement getColorDropdownMenu() {
        return colorDropdownMenu;
    }

    public List<SelenideElement> getColorDropdownMenuOptions() {
        return colorDropdownMenuOptions;
    }

    public SelenideElement getDefaultButton() {
        return defaultButton;
    }

    public SelenideElement getButton() {
        return button;
    }
}
