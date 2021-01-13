package epam_jdi_page.steps;

import com.codeborne.selenide.SelenideElement;
import epam_jdi_page.items.different_elements_page.Checkboxes;
import epam_jdi_page.items.different_elements_page.DropdownColors;
import epam_jdi_page.items.different_elements_page.Radios;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.textsInAnyOrder;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AssertionSteps extends AbstractBaseSteps {

    //    COMMON STEPS
    @Step("Page title should be '{0}'")
    public void pageTitleShouldBe(String pageTitle) {
        $("title").shouldBe(attribute("text", pageTitle));
    }

    @Step("Username should be '{0}'")
    public void userNameShouldBe(String userName) {
        headerMenu.getUserName().shouldBe(text(userName));
    }


    //    HEADER STEPS
    @Step("Header menu items should be '{0}'")
    public void headerMenuItemsShouldBe(List<String> menuItems) {
        headerMenu.getHeaderNavigationMenuItems().forEach(item -> item.shouldBe(visible));
        $$(headerMenu.getHeaderNavigationMenuItems()).shouldHave(textsInAnyOrder(menuItems));
    }

    @Step("Service submenu items in header menu should be '{0}'")
    public void serviceMenuItemsInHeaderSHouldBe(List<String> items) {
        serviceItemsMenuShouldBe(headerMenu.getServiceDropdownMenu(), items);
    }


    //    NAVIGATION SIDEBAR STEPS
    @Step("Navigation sidebar should be displayed")
    public void navigationBarisDisplayed() {
        navigationSideBar.getNavigationSidebar().shouldBe(visible);
    }

    @Step("Service submenu items in navigation sidebar menu should be '{0}'")
    public void serviceMenuItemsInNavigationBarShouldBe(List<String> items) {
        serviceItemsMenuShouldBe(navigationSideBar.getServiceMenuItems(), items);
    }


    //    FOOTER STEPS
    @Step("Footer should be displayed")
    public void footerIsDisplayed() {
        footer.getFooter().shouldBe(visible);
    }


    //    RIGHT SECTION STEPS
    @Step("Right section should be displayed")
    public void rightSectionIsDisplayed() {
        rightSidebar.getRightSidebar().shouldBe(visible);
    }


    //    HOME PAGE STEPS
    @Step("Benefit icon should be displayed")
    public void benefitIconsShouldBeDisplayed() {
        homePage.getBenefitIcons().forEach(icon -> icon.shouldBe(visible));
    }

    @Step("Benefit text should be '{0}'")
    public void benefitTextsShouldBe(HashMap<Integer, String> texts) {
        int imageCount = 0;
        for (SelenideElement currentBenefitText : homePage.getBenefitTexts()) {
            currentBenefitText.shouldBe(visible);
            currentBenefitText.shouldBe(exactText(texts.get(imageCount)));
            imageCount++;
        }
    }

    @Step("Main title text should be '{0}'")
    public void mainTitleTextShouldBe(String titleText) {
        homePage.getMainTitleText().shouldBe(text(titleText));
    }

    @Step("JDI text should be")
    public void jdiTextShouldBe(String jdiText) {
        homePage.getJdiText().shouldBe(text(jdiText));
    }

    @Step("iFrame hsould exist")
    public void iFrameShouldExist() {
        homePage.getIFrame().should(exist);
    }

    @Step("Epam log should be displayed")
    public void epamLogoShouldBeDisplayed() {
        homePage.getEpamLogo().should(exist);
    }

    @Step("JDI github link should be displayed")
    public void jdiGithubLinkIsDisplayed() {
        homePage.getJdiGithubLink().should(exist);
    }

    @Step("JDI github linktext should be '{0}'")
    public void jdiGithubLinkTextShouldBe(String gitHubLinkText) {
        homePage.getJdiGithubLink().shouldBe(text(gitHubLinkText));
    }

    @Step("JDI github link should be '{0}'")
    public void jdiGitHubLinkSHouldBe(String link) {
        homePage.getJdiGithubLink().shouldBe(attribute("href", link));
    }


    //    DIFFERENT ELEMENTS PAGE STEPS
    @Step("4 checkboxes should be")
    public void fourCheckboxesShouldBe() {
        assertEquals(differentElementsPage.getElementsCheckboxes().size(), 4);
    }

    @Step("4 radios should be")
    public void fourRadiosShouldBe() {
        assertEquals(differentElementsPage.getMetalsRadios().size(), 4);
    }

    @Step("1 dropdown should be")
    public void dropdownShouldBe() {
        differentElementsPage.getColorDropdownMenu().should(exist);
    }

    @Step("2 buttons should be")
    public void twoButtonsShouldBe() {
        differentElementsPage.getDefaultButton().should(exist);
        differentElementsPage.getButton().should(exist);
    }

    @Step("Checkbox {0} is selected")
    public void checkboxShouldBeSelected(Checkboxes checkboxName) {
        for (int i = 0; i < differentElementsPage.getElementsCheckboxes().size(); i++) {
            if (checkboxName.getCheckboxName()
                    .equals(differentElementsPage.getElementsCheckboxes().get(i).getText())) {
                assertTrue(differentElementsPage.getElementsCheckboxesButtons().get(i).isSelected());
            }
        }
    }

    @Step("Each checkbox there is an individual log row and value is corresponded to the status of checkbox")
    public void checkboxesLogRowCheck() {
        for (int i = 0; i < differentElementsPage.getElementsCheckboxes().size(); i++) {
            differentElementsPage.getElementsCheckboxesButtons().get(i).click();
            if (differentElementsPage.getElementsCheckboxesButtons().get(i).isSelected()) {
                assertTrue(rightSidebar.getLogList().get(0).getText()
                        .contains(Checkboxes.getCheckboxesNames().get(i)
                                + ": condition changed to true"));
            } else {
                assertTrue(rightSidebar.getLogList().get(0).getText()
                        .contains(Checkboxes.getCheckboxesNames().get(i)
                                + ": condition changed to false"));
            }
        }
    }

    @Step("Radio {0} is selected")
    public void radioShouldBeSelected(Radios radiobutton) {
        for (int i = 0; i < differentElementsPage.getMetalsRadioButtons().size(); i++) {
            if (radiobutton.getRadioName()
                    .equals(differentElementsPage.getMetalsRadios().get(i).getText())) {
                assertTrue(differentElementsPage.getMetalsRadioButtons().get(i).isSelected());
                assertTrue(rightSidebar.getLogList().get(0).getText()
                        .contains("metal: value changed to " + Radios.getRadioNames().get(i)));
            }
        }
    }

    @Step("Each radio there is an individual log row and value is corresponded to its status")
    public void radiosLogRowCheck() {
        for (int i = 0; i < differentElementsPage.getMetalsRadioButtons().size(); i++) {
            if (differentElementsPage.getMetalsRadioButtons().get(i).isSelected()) {
                assertTrue(rightSidebar.getLogList().get(0).getText()
                        .contains(Radios.getRadioNames().get(i)));
            }
        }
    }

    @Step("Radio {0} is selected")
    public void dropdownColorShouldBeSelected(DropdownColors dropdownColor) {
        for (int i = 0; i < differentElementsPage.getColorDropdownMenuOptions().size(); i++) {
            if (dropdownColor.getColorName()
                    .equals(differentElementsPage.getColorDropdownMenuOptions().get(i).getText())) {
                assertTrue(differentElementsPage.getColorDropdownMenuOptions().get(i).isSelected());
            }
        }
    }

    @Step("Log row is displayed, dropdown name and selected value is corresponding to selected")
    public void colorsLogRowCheck() {
        for (int i = 0; i < differentElementsPage.getColorDropdownMenuOptions().size(); i++) {
            if (differentElementsPage.getColorDropdownMenuOptions().get(i).isSelected()) {
                assertTrue(rightSidebar.getLogList().get(0).getText()
                        .contains("Colors: value changed to " + DropdownColors.getColorNames().get(i)));
            }
        }
    }


    //    TABLE PAGES STEPS
    @Step("Entrities quantity value should be '{0}'")
    public void showEntriesDropdownValueShouldBe(String currentValue) {
        tablePages.getCurrentEntriesValue().shouldBe(value(currentValue));
    }

    @Step("Table headers should be '{0}'")
    public void tableHeadShouldBe(List<String> expectedTableHead) {
        List<String> actualTableHead = new ArrayList<>();
        for (SelenideElement element : tablePages.getTableHead()) {
            actualTableHead.add(element.getText());
        }
        assertEquals(actualTableHead, expectedTableHead);
    }

    @Step("Table should have size '{0}'")
    public void tableShouldHaveSize(int size) {
        $$(tablePages.getTableBody()).shouldHaveSize(size);
    }

    @Step("Every searched table element should contain search results '{0}'")
    public void everyTableElementShouldContainSearchResults(String results) {
        for (SelenideElement tableElement : tablePages.getTableBody()) {
            tableElement.shouldHave(text(results));
        }
    }


    //    UTILS
    private void serviceItemsMenuShouldBe(List<SelenideElement> actualItems, List<String> expectedItems) {
        SoftAssert softAssert = new SoftAssert();
        boolean cond;
        for (SelenideElement item : actualItems) {
            cond = expectedItems.contains(item.innerText().toUpperCase().trim());
            item.shouldBe(visible);
            softAssert.assertTrue(cond);
        }
        softAssert.assertAll();
    }
}

