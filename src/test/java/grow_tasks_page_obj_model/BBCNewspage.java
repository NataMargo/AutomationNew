package grow_tasks_page_obj_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBCNewspage extends PageObjectBBC {
    public BBCNewspage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/a/h3[contains(@class, 'title gel-paragon-bold')]")
    private WebElement headline;
    @FindBy(xpath = "//div[contains(@data-entityid,'top-stories#3')]")
    private WebElement article3;
    @FindBy(xpath = "//div[contains(@data-entityid,'top-stories#2')]")
    private WebElement article2;
    @FindBy(xpath = "//div[contains(@data-entityid,'top-stories#4')]")
    private WebElement article4;
    @FindBy(xpath = "//div[contains(@data-entityid,'top-stories#5')]")
    private WebElement article5;
    @FindBy(xpath = "//div[contains(@data-entityid,'top-stories#6')]")
    private WebElement article6;
    @FindBy(xpath = "//input[@id='orb-search-q']")
    private WebElement searchField;
    @FindBy(xpath = "//div/button[@id='orb-search-button']")
    private WebElement searchButton;
    @FindBy(xpath= "//div[2]//nav//span/button/span")
    private WebElement moreDrop;
    @FindBy(xpath= "//div[7]//ul[4]/li/a/span")
    private WebElement haveYouSay;




}

