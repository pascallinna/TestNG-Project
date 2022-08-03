package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.AddCategoryValidationPage;
import page.Validate_Add_CategoryPage;
import util.BrowserFactory;

public class Validate_Add_CategoryTest {

    WebDriver driver;

    @Test
    public void validate_Add_Category(){
        driver = BrowserFactory.init();
        Validate_Add_CategoryPage categoryObject = PageFactory.initElements(driver, Validate_Add_CategoryPage.class);
        categoryObject.addCategory("flora");
        BrowserFactory.tearDown();
    }
}
