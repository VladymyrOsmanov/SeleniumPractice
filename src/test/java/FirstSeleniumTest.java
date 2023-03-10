import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.*;

public class FirstSeleniumTest {

    private static final String HOME_PAGE_URL ="https://www.facebook.com/";
    private static WebDriver driver;

    @BeforeAll
    public static void classSetup()
    {
        driver = SharedDriver.getWebDriver();
        driver.get(HOME_PAGE_URL);
    }
    @AfterAll
    public static void classTearDown()
    {
        SharedDriver.closeDriver();
    }
    @AfterEach
    public void testTeardown()
    {
        driver.get(HOME_PAGE_URL);
    }
    @Test
    public void openBrowserTest()
    {
        String actualURL = driver.getCurrentUrl();
        assertEquals(HOME_PAGE_URL, actualURL, "URLs do not match");
    }
}
