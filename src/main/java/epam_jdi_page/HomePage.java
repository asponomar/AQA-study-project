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
    private WebElement mainTitleText;

    @FindBy(name = "jdi-text")
    private WebElement jdiText;

    @FindBy(id = "iframe")
    private WebElement iFrame;

    @FindBy(id = "epam_logo")
    private WebElement epamLogo;

    @FindBy(linkText = "JDI GITHUB")
    private WebElement jdiGithubLink;

    @FindBy(name = "navigation-sidebar")
    private WebElement navigationSidebar;

    @FindBy(tagName = "footer")
    private WebElement footer;

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

    public WebElement getMainTitleText() {
        return mainTitleText;
    }

    public WebElement getJdiText() {
        return jdiText;
    }

    public WebElement getiFrame() {
        return iFrame;
    }

    public WebElement getEpamLogo() {
        return epamLogo;
    }

    public WebElement getJdiGithubLink() {
        return jdiGithubLink;
    }

    public WebElement getNavigationSidebar() {
        return navigationSidebar;
    }

    public WebElement getFooter() {
        return footer;
    }

    public void switchToIFrame() {
        driver.switchTo().frame(iFrame);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }
}

