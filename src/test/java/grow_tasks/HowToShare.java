package grow_tasks;

import grow_tasks_page_obj_model.PageObjectBBC;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HowToShare extends PageObjectBBC {
    public HowToShare(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/div[@class='contact-form__submit']/input[4]")
    private WebElement sendButton;
    @FindBy(id = "fullName")
    private WebElement nameField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "town")
    private WebElement townField;
    @FindBy(id = "phone")
    private WebElement phoneField;
    @FindBy(id = "message")
    private WebElement messageField;


    public void enterName(String name) {
        this.nameField.clear();
        this.nameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        this.emailField.clear();
        this.emailField.sendKeys(email);
    }

    public void enterTown(String town) {
        this.townField.clear();
        this.townField.sendKeys(town);
    }

    public void enterPhone(String phone) {
        this.phoneField.clear();
        this.phoneField.sendKeys(phone);
    }

    public void enterMessage(String message) {
        this.messageField.clear();
        this.messageField.sendKeys(message);
    }

}
