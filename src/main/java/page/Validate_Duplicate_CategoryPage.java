package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Validate_Duplicate_CategoryPage extends BasePage{

    WebDriver driver;

    @FindBy(how = How.CSS, using = "input[name='categorydata']")
    WebElement Enter_Category_Name;

    @FindBy(how = How.CSS, using = "input[value='Add category']")
    WebElement Added_Category;

    @FindBy(how = How.XPATH, using = "/html/body/text()[1]")
    WebElement Other_Page;

    @FindBy(how = How.XPATH, using = "/html/body/a[2]")
    WebElement return_To_Previous_Page;
    public void addCategory(String name) {
        String insertedName = name + generateRandom(999);
        Enter_Category_Name.sendKeys(insertedName);
        System.out.println(insertedName);
        Added_Category.click();



        //Enter_Category_Name.sendKeys(name);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //Added_Category.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //String currentTab = driver.getWindowHandle();
        //ArrayList<String>newTab = new ArrayList<String>(driver.getWindowHandles());
        //driver.switchTo().window(newTab.get(0));
        //Expected Error Message
        String expectedError = "The category you want to add already exists:" + name;
        //Actual Error Message
        WebElement mesg = Other_Page;
        String actualError = mesg.getText();
        Assert.assertEquals(expectedError,actualError);

    }
    public void Return_To_Previous_Page (){
        return_To_Previous_Page.click();
    }
    public void newPageValidation(){

    }

    public void switchToNewTab() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while (it.hasNext()){
            String child = it.next();
            driver.switchTo().window(child);
        }
    }

    }

