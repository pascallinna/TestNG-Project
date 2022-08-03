package page;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public int generateRandom(int bounderyNum) {
        Random rnd = new Random();
        int generatedNum = rnd.nextInt(bounderyNum);
        return generatedNum ;
    }

    public void selectFromDropdown(WebElement  webElement , String visibleText) {
        Select sel = new Select (webElement);
        sel.selectByVisibleText(visibleText);

    }
    public void waitForElement(WebDriver driver, Duration i, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, i);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }











   /*public int randomNumGenerator() {
        Random rnd = new Random();
        int randomNum = rnd.nextInt(999);
        return randomNum;
    }*/

    /*public void selectFromDropdown(WebElement element, String selectByVisibleText) {
        Select sel = new Select (element);
        sel.selectByVisibleText(selectByVisibleText);
    }*/









}
