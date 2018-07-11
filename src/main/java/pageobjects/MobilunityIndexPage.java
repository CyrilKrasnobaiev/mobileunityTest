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

    @Getter
    @FindBy(id = "request-vacancy-message")
    public WebElement errorMessage;

    @FindBy(xpath = "//form[contains(@id, 'request-vacancy-form')]//button[contains(@class, 'button')]")
    public WebElement sendButton;

    @FindBy(id = "catapultCookie")
    public WebElement closeCookiePopoverButton;

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

    public void clickOnSendButton() {
        sendButton.click();
    }

    public void closeCookiePopover() {
        closeCookiePopoverButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
