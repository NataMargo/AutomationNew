package grow_tasks_page_obj_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBCHomepage extends PageObjectBBC {
    public BBCHomepage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//li[@class='orb-nav-newsdotcom']/a")
    private WebElement newsButton;
}
