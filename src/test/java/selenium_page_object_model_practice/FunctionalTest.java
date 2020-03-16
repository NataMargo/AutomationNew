package selenium_page_object_model_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {
    protected static WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterGroups
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
