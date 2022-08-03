package test;

import util.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.AddCategoryValidationPage;

public class AddCategoryValidationTest {

    WebDriver driver;
// calling method from the AddCategoryValidationPage
    @Test
    public void addCategoryValidationPage() {
        driver = BrowserFactory.init();
        AddCategoryValidationPage categoryObject = PageFactory.initElements(driver, AddCategoryValidationPage.class);
        categoryObject.validate_add_category("kojo");
       // categoryObject.duplicate_category_display("Kweku");
        BrowserFactory.tearDown();
    }

    }
