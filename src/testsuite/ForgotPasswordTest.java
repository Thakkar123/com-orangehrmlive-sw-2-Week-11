package testsuite;

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);
    }

    @Test
    // Verifying user should be able to navigate to forgot password link
    public void userShouldNavigateToForgotPassword()
    {
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot your password?"));
        forgotPasswordLink.click();
        // This is from requirement
        String expectedText = "Forgot Your Password?";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Forgot password text not displayed",expectedText,actualText);
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
