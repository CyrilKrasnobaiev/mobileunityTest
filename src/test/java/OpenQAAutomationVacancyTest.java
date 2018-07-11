import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static utility.services.WaiterService.waitForElementVisible;


public class OpenQAAutomationVacancyTest extends BaseTestClass {

    @Test
    public void test_001() {
        waitForElementVisible(mobilunity.vacancyTitle);
        assertEquals(mobilunity.vacancyTitle.getText(), mobilunity.getUrl().replace(" | Mobilunity", ""));
    }
}

