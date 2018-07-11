package utility.services;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertTrue;

public class WaiterService {

    private static WebDriver driver;
    public WaiterService(WebDriver driver){
        WaiterService.driver = driver;
    }

    public static void waitForElementVisible(WebElement element) {

        try {
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch (TimeoutException e){
            assertTrue(false, "ELEMENT: \"" + element + "\" is not presents.");
        }
    }
}
