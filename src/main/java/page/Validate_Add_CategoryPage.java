package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Validate_Add_CategoryPage  extends BasePage{

    WebDriver driver;

    @FindBy(how = How.CSS, using = "input[name='categorydata']")
    WebElement Enter_Name_Category;

    @FindBy(how = How.CSS, using = "input[value='Add category']")
    WebElement Add_Category;

    @FindBy(how = How.XPATH, using = "//select[@name='category']")
    WebElement categoryAdded;




    public void addCategory(String categoryName) {
        String insertedName = categoryName + generateRandom(999);
        Enter_Name_Category.sendKeys(insertedName);
        String addCategory=insertedName.toString();
        //System.out.println(addedCategory);

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

        Select sel = new Select(categoryAdded);
        sel.selectByVisibleText(addCategory);
        selectFromDropdown(categoryAdded,addCategory );
        //System.out.println(addedCategory);
    }


    }


