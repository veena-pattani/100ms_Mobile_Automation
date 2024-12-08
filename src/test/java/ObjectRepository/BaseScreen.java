package ObjectRepository;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BaseScreen {
    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;

    public BaseScreen(AndroidDriver<MobileElement>driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    protected void click(By by)
    {
        driver.findElement(by).click();
    }


    protected List<WebElement> waitAndFindElements(By by)
    {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected WebElement waitAndFindElement(By by)
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected WebElement elementDisplayed(By by)
    {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected String getText(By by)
    {
        return waitAndFindElement(by).getText();
    }

    protected void sendKey(By by, String text)
    {
        waitAndFindElement(by).sendKeys(text);
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void assertEquals (String actual, String expected) {
        Assert.assertEquals(actual,expected, "Two texts are not equal!" + "Actual: " + actual + " Expected: " + expected);
    }

    public void ClearText(By by)
    {
        driver.findElement(by).clear();
    }

    public void closeKeyboard() {

        driver.hideKeyboard();
    }

}
