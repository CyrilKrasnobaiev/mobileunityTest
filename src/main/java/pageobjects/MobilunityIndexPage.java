package pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MobilunityIndexPage {

    protected WebDriver driver;

    @Getter
    @FindBy(xpath = "//h1")
    public WebElement vacancyTitle;

    public MobilunityIndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String getVacancyTitle() {
        return vacancyTitle.getText();
    }

}
