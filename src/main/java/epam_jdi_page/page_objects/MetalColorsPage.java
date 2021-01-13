package epam_jdi_page.page_objects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class MetalColorsPage extends AbstractBasePageWithRightsideBar {

    //SUMMARY
    private final List<SelenideElement> summaryRadioButtons = $$(cssSelector("#summary-block .radio"));

    private final List<SelenideElement> oddsRadioButtons = $$(cssSelector("#odds-selector .radio"));

    private final List<SelenideElement> evenRadioButtons = $$(cssSelector("#even-selector .radio"));

    private final SelenideElement calculateButton = $(id("calculate-button"));

    //ELEMENTS
    private final List<SelenideElement> elementsCheckboxes = $$(cssSelector("#elements-checklist .checkbox"));


    private final List<SelenideElement> colorsMenuItems = $$(cssSelector("#colors li"));

    private final SelenideElement currentColor = $(cssSelector("#colors .filter-option"));

    //COLORS
    private final List<SelenideElement> metalsMenuItems = $$(cssSelector("#metals li"));

    private final SelenideElement metalsMenuButton = $(cssSelector("#metals .caret"));

    private final SelenideElement currentMetal = $(cssSelector("#metals"));

    //METALS
    private final List<SelenideElement> vegetablesCheckboxesItems = $$(cssSelector("#salad-dropdown li"));

    private final SelenideElement currentVegetables = $(cssSelector("#salad-dropdown"));

    private final SelenideElement submitButton = $(id("submit-button"));


    public List<SelenideElement> getSummaryRadioButtons() {
        return summaryRadioButtons;
    }

    public List<SelenideElement> getOddsRadioButtons() {
        return oddsRadioButtons;
    }

    public List<SelenideElement> getEvenRadioButtons() {
        return evenRadioButtons;
    }

    public SelenideElement getCalculateButton() {
        return calculateButton;
    }

    public List<SelenideElement> getElementsCheckboxes() {
        return elementsCheckboxes;
    }

    public List<SelenideElement> getColorsMenuItems() {
        return colorsMenuItems;
    }

    public SelenideElement getCurrentColor() {
        return currentColor;
    }

    public List<SelenideElement> getMetalsMenuItems() {
        return metalsMenuItems;
    }

    public SelenideElement getMetalsMenuButton() {
        return metalsMenuButton;
    }

    public SelenideElement getCurrentMetal() {
        return currentMetal;
    }

    public List<SelenideElement> getVegetablesCheckboxesItems() {
        return vegetablesCheckboxesItems;
    }

    public SelenideElement getCurrentVegetables() {
        return currentVegetables;
    }

    public SelenideElement getSubmitButton() {
        return submitButton;
    }
}
