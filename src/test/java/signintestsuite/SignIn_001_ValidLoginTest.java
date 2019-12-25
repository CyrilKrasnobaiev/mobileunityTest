package signintestsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.SignInPage;
import serviceclasses.BaseTest;
import utility.Constants;
import utility.testservices.WaiterService;

import static utility.testservices.UrlService.getDirectlyURL;


public class SignIn_001_ValidLoginTest extends BaseTest {

    @Test
    public void test_001() {

        getDirectlyURL(Constants.DESIGNINURL);

        SignInPage loginForm = initElements(driver, SignInPage.class);
        loginForm.clickOnCookieButton();
        loginForm.fillLoginEmailField(testUser.get("email"));
        loginForm.fillLoginPasswordField(testUser.get("password"));
        loginForm.clickOnLoginButton();
        WaiterService.waitPageLoader(Constants.MYSTAXTERURL, 5);

        Assert.assertEquals(driver.getCurrentUrl(), Constants.MYSTAXTERURL);
    }
}
