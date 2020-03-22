package page_object_model_practice;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static page_object_model_practice.CheckBoxesPage.*;

public class TestCheckBoxes extends BeforeTesting {

    @Test
    public void checkBoxes() {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);

        checkBoxesPage.setCheckbox1();
        checkBoxesPage.setCheckbox2();
        checkBoxesPage.setCheckbox3();
        Assert.assertTrue(checkBoxesPage.getCheckbox_one().isSelected(), "Checkbox is toggled off");
        Assert.assertTrue(checkBoxesPage.getCheckbox_two().isSelected(), "Checkbox is toggled off");
        Assert.assertTrue(checkBoxesPage.getCheckbox_three().isSelected(), "Checkbox is toggled off");
    }
}
