package grow_tasks_page_obj_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectBBC {
            protected WebDriver driver;
        public PageObjectBBC(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    }

