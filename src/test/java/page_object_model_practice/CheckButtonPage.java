package page_object_model_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckButtonPage extends PageObject {
    private static final String BASE_URL_A = "//div[@class='col-sm-8']/button";
    private static final String BASE_URL_B = "//div[@class='btn-group']/button";
    private static final String BASE_URL_C = "//div[contains(@aria-label, 'dropdown')]/button";
    private static final String BASE_URL_D = " div[class='dropdown-menu show'] > a:nth-child";

    @FindBy(xpath = BASE_URL_A + "[1]")
    private WebElement primaryButton;

    @FindBy(xpath = BASE_URL_A + "[2]")
    private WebElement successButton;

    @FindBy(xpath = BASE_URL_A + "[3]")
    private WebElement infoButton;

    @FindBy(xpath = BASE_URL_A + "[4]")
    private WebElement warningButton;

    @FindBy(xpath = BASE_URL_A + "[5]")
    private WebElement dangerButton;

    @FindBy(xpath = BASE_URL_A + "[6]")
    private WebElement linkButton;

    @FindBy(xpath = BASE_URL_B + "[1]")
    private WebElement leftButton;

    @FindBy(xpath = BASE_URL_B + "[2]")
    private WebElement middleButton;

    @FindBy(xpath = BASE_URL_B + "[3]")
    private WebElement rightButton;

    @FindBy(xpath = BASE_URL_C + "[1]")
    private WebElement button1;

    @FindBy(xpath = BASE_URL_C + "[2]")
    private WebElement button2;

    @FindBy(id = "btnGroupDrop1")
    private WebElement dropDownMenu;

    @FindBy(css = BASE_URL_D + "(1)")
    private WebElement dropDown1;

    @FindBy(css = BASE_URL_D + "(2)")
    private WebElement dropDown2;

    CheckButtonPage(WebDriver driver) {
        super(driver);
    }

    public void dropDownItem1Click() {
        dropDownMenu.click();
        dropDown1.click();
    }

    public void dropDownItem2Click() {
        dropDownMenu.click();
        dropDown2.click();
    }

    public void clickPrimaryButton() {
        primaryButton.click();
    }

    public void clickSuccessButton() {
        successButton.click();
    }

    public void clickInfoButton() {
        infoButton.click();
    }

    public void clickDangerButton() {
        dangerButton.click();

    }

    public void clickWarningButton() {
        warningButton.click();
    }

    public void clickLinkButton() {
        linkButton.click();
    }

    public void clickLeftButton() {
        leftButton.click();
    }

    public void clickRightButton() {
        rightButton.click();
    }

    public void clickButton1() {
        button1.click();
    }

    public void clickButton2() {
        button2.click();
    }

    public void clickMiddleButton() {
        middleButton.click();
    }
}
