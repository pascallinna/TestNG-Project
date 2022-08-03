package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Validate_Duplicate_CategoryPage;
import util.BrowserFactory;

public class Validate_Duplicate_CategoryTest {
    WebDriver driver;

    @Test
    public void validate_Add_Category() {
        driver = BrowserFactory.init();
        Validate_Duplicate_CategoryPage objectCategory = PageFactory.initElements(driver, Validate_Duplicate_CategoryPage.class);
        objectCategory.addCategory("flora");
        //objectCategory.newPageValidation();
        //objectCategory.switchToNewTab();
        BrowserFactory.tearDown();
    }


}
