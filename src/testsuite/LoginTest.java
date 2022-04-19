package testsuite;

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);
    }

    @Test
    // Verifying user should be able to login with valid credentials
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        // This is from requirement
        String expectedText="Welcome Simran";
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement actualTextElement = driver.findElement(By.id("welcome"));
        String actualText = actualTextElement.getText();
        // Verifying actual and expected text
        Assert.assertEquals("Welcome text is not displayed",expectedText,actualText);
    }
    @After
    public void tearDown()
    {
       closeBrowser();
    }

}
