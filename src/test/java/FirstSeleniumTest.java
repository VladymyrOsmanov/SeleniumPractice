import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FirstSeleniumTest {
    @Test
    public void openBrowserTest(){
        WebDriver driver = SharedDriver.getWebDriver();
        SharedDriver.closeDriver();
    }
}
