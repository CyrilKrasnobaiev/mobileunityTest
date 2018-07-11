import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageobjects.MobilunityIndexPage;
import utility.Constants;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BaseTestClass {

    public WebDriver driver;
    public MobilunityIndexPage mobilunity;

    public static void waitForElementVisible(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementDissapear(WebElement element, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @BeforeTest
    public void beforeTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        mobilunity = initElements(driver, MobilunityIndexPage.class);
    }

    @AfterTest
    public void closeBrowser () {
        driver.quit();
    }
}