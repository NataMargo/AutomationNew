package page_object_model_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends PageObject {

    private static final String BASE_URL = "https://formy-project.herokuapp.com/";

    @FindBy(id = "dropdownMenuButton")
    private WebElement dropDownMenu;

    @FindBy(xpath = "//div/div/a[6]")
    private WebElement dropDownButton;

    public DropDownPage(WebDriver driver) {
        super(driver);
    }


    public void clickDropDownMenu() {
        dropDownMenu.click();
    }
    public void clickDropDownButton() {
        dropDownButton.click();
    }
}
