package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class DropDownWithDataProvider {
    private static final String EXE_PATH = "C:\\webdrivers\\chromedriver.exe";
    private static WebDriver chromeDriver = new ChromeDriver();

    @BeforeClass
    public static void openWindow() {
        System.setProperty("webdriver.chrome.driver", EXE_PATH);
        chromeDriver.get("https://formy-project.herokuapp.com/dropdown");
    }
    @BeforeMethod
    public static void choseDropDownMenu(){
        WebElement dropDownMenu = chromeDriver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
    }

    @AfterClass
    public static void closeWindow() {
        chromeDriver.quit();
    }

    private static final String BASE_URL = "https://formy-project.herokuapp.com/";

    @DataProvider
    public static Object[][] getDropDownItem() {
        return new Object[][]{
                {BASE_URL + "autocomplete", "//div/div/a[1]"},
                {BASE_URL + "buttons", "//div/div/a[2]"},
                {BASE_URL + "checkbox", "//div/div/a[3]"},
                {BASE_URL + "datepicker", "//div/div/a[4]"},
                {BASE_URL + "dragdrop", "//div/div/a[5]"},
                {BASE_URL + "enabled", "//div/div/a[7]"},
                {BASE_URL + "fileupload", "//div/div/a[8]"},
                {BASE_URL + "filedownload", "//div/div/a[9]"},
                {BASE_URL + "keypress", "//div/div/a[10]"},
                {BASE_URL + "modal", "//div/div/a[11]"},
                {BASE_URL + "scroll", "//div/div/a[12]"},
                {BASE_URL + "radiobutton", "//div/div/a[13]"},
                {BASE_URL + "switch-window", "//div/div/a[14]"},
                {BASE_URL + "form", "//div/div/a[15]"}
        };
    }

    @Test(dataProvider = "getDropDownItem")
    public void clickDropDownButtons(String expectedUrl, String dropDownItemXpath) {
        WebElement dropDownItem = chromeDriver.findElement(By.xpath(dropDownItemXpath));
        dropDownItem.click();
        String actualResult = chromeDriver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedUrl, "Link is not correct. Actual result is: " + actualResult + " Expected: " + expectedUrl);
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void clickDropDownItem() {
        WebElement dropDownItem = chromeDriver.findElement(By.xpath("//div/div/a[6]"));
        dropDownItem.click();
        String actualResult = chromeDriver.getCurrentUrl();
        Assert.assertEquals(actualResult, BASE_URL + "dropdown", "Link is not correct. Actual result is: " + actualResult + " Expected: " + BASE_URL + "dropdown");
        chromeDriver.navigate().back();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}


