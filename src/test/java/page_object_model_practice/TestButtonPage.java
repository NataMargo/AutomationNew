package page_object_model_practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestButtonPage extends BeforeTesting {
    @BeforeMethod
    public void openWindow() {
        driver.get("https://formy-project.herokuapp.com/buttons");
    }

    @Test
    public void checkButtons() {
        CheckButtonPage checkButtonPage = new CheckButtonPage(driver);
        checkButtonPage.clickPrimaryButton();
        checkButtonPage.clickButton1();
        checkButtonPage.clickButton2();
        checkButtonPage.clickDangerButton();
        checkButtonPage.clickInfoButton();
        checkButtonPage.clickLeftButton();
        checkButtonPage.clickLinkButton();
        checkButtonPage.clickMiddleButton();
        checkButtonPage.clickRightButton();
        checkButtonPage.clickSuccessButton();
        checkButtonPage.clickWarningButton();
    }

    @Test
    public void checkDropDown() {
        CheckButtonPage checkButtonPage = new CheckButtonPage(driver);
        checkButtonPage.dropDownItem1Click();
        checkButtonPage.dropDownItem2Click();
    }

}
