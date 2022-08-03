package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Validate_Month_DropdownPage extends BasePage{

    WebDriver driver;

    @FindAll({@FindBy( how = How.CSS, using = "select[name='due_month']")})
    List<WebElement> All_MONTH_Element;

    public void validate_All_Months() {

        //List<WebElement> elements = driver.findElements(By.xpath("//select[@name='due_month']"));

        List<WebElement> elements = All_MONTH_Element;

        for (WebElement All_MONTH_Element : elements) {
            All_MONTH_Element.getText().toString();
            //System.out.println( All_MONTH_Element.getText().toString());

            //Select sel = new Select((WebElement) All_MONTH_Element);
            //sel.selectByVisibleText(elements.containsAll(All_MONTH_Element.isDisplayed()));
            //selectFromDropdown(All_MONTH_Element, "All_MONTH_Element.getText().toString()" );
            Assert.assertEquals(true,  All_MONTH_Element.isDisplayed());
        }





        }
    }
