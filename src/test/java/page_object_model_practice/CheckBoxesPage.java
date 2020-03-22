package page_object_model_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxesPage extends PageObject {

    @FindBy(id = "checkbox-1")
    private WebElement checkbox_one;


    @FindBy(id = "checkbox-2")
    private WebElement checkbox_two;

    @FindBy(id = "checkbox-3")
    private WebElement checkbox_three;

    public WebElement getCheckbox_one() {
        return checkbox_one;
    }

    public WebElement getCheckbox_two() {
        return checkbox_two;
    }

    public WebElement getCheckbox_three() {
        return checkbox_three;
    }
    CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    void setCheckbox1() {
        checkbox_one.click();

    }

    void setCheckbox2() {
        checkbox_two.click();
    }

    void setCheckbox3() {
        checkbox_three.click();
    }
}
