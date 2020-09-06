package epam_jdi_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends AbstractBasePage {

    @FindBy(className = "benefit-icon")
    private List<WebElement> benefitIcons;

    @FindBy(className = "benefit-txt")
    private List<WebElement> benefitTexts;

    @FindBy(name = "main-title")
    private String mainTitleText;

    //        Still don't uderstand how PageFactory works
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getBenefitIcons() {
        return benefitIcons;
    }

    public List<WebElement> getBenefitTexts() {
        return benefitTexts;
    }
}
