package selenium_page_object_model_practice;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SeleniumPageOM extends FunctionalTest {
    private final String SIGN_UP_EXPECTED = "https://www.kimschiller.com/page-object-pattern-tutorial/index.html";
    private final String RECEIPT_EXPECTED = "https://www.kimschiller.com/page-object-pattern-tutorial/receipt.html?";

    @Test
    public void openSignUpPage() {
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertEquals(SIGN_UP_EXPECTED, driver.getCurrentUrl(), "signUp page is not initialized");
    }

    @Test
    public void signUp() {
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterNameSurname("First", "Last");
        signUpPage.enterAddressZip("123 Street", "12345");

        ReceiptPage receiptPage = signUpPage.submit();
        Assert.assertEquals(RECEIPT_EXPECTED, driver.getCurrentUrl(), "Receipt page is not initialized");

        assertEquals("Thank you!", receiptPage.confirmationHeader());


    }
}



