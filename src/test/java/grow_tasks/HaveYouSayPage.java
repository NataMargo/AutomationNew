package grow_tasks;

import grow_tasks_page_obj_model.PageObjectBBC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HaveYouSayPage extends PageObjectBBC {
    public HaveYouSayPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath= "//div[2]/div[3]/div/div/div/a")
    private WebElement toShare;

}
