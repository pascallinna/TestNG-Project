package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCategoryValidationPage  extends BasePage {

    WebDriver driver;

    public void addCategoryValidationPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.CSS, using = "input[name='data']")
    WebElement Enter_Name_Category;

    @FindBy(how = How.CSS, using = "input[value='Add']")
    WebElement Add_Category;

    @FindBy(how = How.CSS, using = "input[value='Add']")
    WebElement Add_Duplicate_Category;

    @FindBy(how = How.CSS, using = "select[ name='due_month']")
    WebElement Month_Drop_Down;

// Creating our methods with our input from @FindBy
    public void validate_add_category(String fullName) {
        String insertedName = fullName + generateRandom(999);
        Enter_Name_Category.sendKeys( insertedName);
       // Enter_Name_Category.sendKeys(name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Add_Category.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(true, Add_Category.isDisplayed());
    }

    public void duplicate_category_display(String name) {
        Enter_Name_Category.sendKeys(name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Add_Duplicate_Category.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(true, Add_Duplicate_Category.isDisplayed());
    }

    public void drop_down_month() {
        Month_Drop_Down.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(true, Month_Drop_Down.isSelected());
    }


}




