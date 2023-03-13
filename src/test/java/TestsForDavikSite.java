import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.swing.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestsForDavikSite {
    private static final String HOME_PAGE_URL = "https://daviktapes.com/";
    private static WebDriver driver;
    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 1);
    @BeforeAll
    public static void classSetup() {
        driver = SharedDriver.getWebDriver();
        driver.get(HOME_PAGE_URL);
    }
    @AfterAll
    public static void classTearDown()
    {SharedDriver.closeDriver();}
    @AfterEach
    public void testTeardown() {
        driver.get(HOME_PAGE_URL);
    }

    //Using actions class, move the mouse to every top menu option and verify it`s opened in each case.
    @Test
    public void actionTestForCompany() throws InterruptedException {
    WebElement company = driver.findElement(By.xpath("//a[text() = 'Company']"));
    actions.moveToElement(company).build().perform();
    WebElement element = driver.findElement(By.xpath("//a[text() = 'Davik Ethical Code']"));
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Davik Ethical Code']")));
    assertNotNull(element);
    }
    @Test
    public void actionTestForProducts() throws InterruptedException {
        WebElement products = driver.findElement(By.xpath("//a[text() = 'Products']"));
        actions.moveToElement(products).build().perform();
        WebElement element = driver.findElement(By.xpath("//a[text() = 'One Sided Tapes']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'One Sided Tapes']")));
        assertNotNull(element);
    }
    @Test
    public void actionTestForIndustries() throws InterruptedException {
        WebElement industries = driver.findElement(By.xpath("//a[text() = 'Industries']"));
        actions.moveToElement(industries).build().perform();
        WebElement element = driver.findElement(By.xpath("//a[text() = 'Retail']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Retail']")));
        assertNotNull(element);
    }
    @Test
    public void actionTestForKnowledgeCenter() throws InterruptedException {
        WebElement company = driver.findElement(By.xpath("//a[text() = 'Knowledge Center']"));
        actions.moveToElement(company).build().perform();
        WebElement element = driver.findElement(By.xpath("//a[text() = 'Events']"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Events']")));
        assertNotNull(element);
    }
}
