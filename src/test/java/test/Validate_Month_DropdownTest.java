package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Validate_Add_CategoryPage;
import page.Validate_Month_DropdownPage;
import util.BrowserFactory;

public class Validate_Month_DropdownTest {

    WebDriver driver;

    @Test
    public void validate_month () {

        driver = BrowserFactory.init();

        Validate_Month_DropdownPage month_dropdownObject = PageFactory.initElements(driver, Validate_Month_DropdownPage.class);
        month_dropdownObject.validate_All_Months();
        BrowserFactory.tearDown();
    }
}
