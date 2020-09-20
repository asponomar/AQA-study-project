package epam_jdi_page;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class MetalColorsPage {

    //SUMMARY
    private List<SelenideElement> summaryRadioButtons = $$(cssSelector("#summary-block .radio"));

    private List<SelenideElement> oddsRadioButtons = $$(cssSelector("#odds-selector .radio"));

    private List<SelenideElement> evenRadioButtons = $$(cssSelector("#even-selector .radio"));

    private SelenideElement calculateButton = $(id("calculate-button"));

    //ELEMENTS
    private List<SelenideElement> elementsCheckboxes = $$(cssSelector("#elements-checklist .checkbox"));


    private List<SelenideElement> colorsMenuItems = $$(cssSelector("#colors li"));

    private SelenideElement currentColor = $(cssSelector("#colors .filter-option"));

    //COLORS
    private List<SelenideElement> metalsMenuItems = $$(cssSelector("#metals li"));

    private SelenideElement metalsMenuButton = $(cssSelector("#metals .caret"));

    private SelenideElement currentMetal = $(cssSelector("#metals"));

    //METALS
    private List<SelenideElement> vegetablesCheckboxesItems = $$(cssSelector("#salad-dropdown li"));

    private SelenideElement currentVegetables = $(cssSelector("#salad-dropdown"));

    private SelenideElement submitButton = $(id("submit-button"));




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
