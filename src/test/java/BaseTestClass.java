import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageobjects.MobilunityIndexPage;
import utility.Constants;

import static org.openqa.selenium.support.PageFactory.initElements;

public class BaseTestClass {


    public WebDriver driver;
    MobilunityIndexPage mobilunity = initElements(driver, MobilunityIndexPage.class);

    @BeforeTest
    public void beforeTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }

    @AfterTest
    public void closeBrowser () {
        driver.quit();
    }
}
