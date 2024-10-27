package Tests;

import Pages.P01_Login;
import Pages.P02_Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

public class TCs {
    private WebDriver driver;
    private P01_Login page1;
    private P02_Home page2;

    @BeforeTest
    public void Setup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void MethodSetUp() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        page1 = new P01_Login(driver);
        page2 = new P02_Home(driver);
    }

    @Test(priority = 1)
    public void CheckVisibility() {
        Assert.assertEquals("user-name", page1.GetUserNameId());
        Assert.assertEquals("password", page1.GetPasswordId());
        Assert.assertEquals("login-button", page1.GetLoginId());

    }

    @Test(priority = 2)
    public void CheckValidCredentials() {
        page1.EnterCredentials("standard_user", "secret_sauce");
        Assert.assertEquals("Swag Labs", page2.GetDivText());
    }

    @Test(priority = 3)
    public void CheckWrongCredentials() {
        page1.EnterCredentials("Nahed", "1010");
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", page1.GetErrorMessageText());

    }

    @Test(priority = 4)
    public void CheckEmptyUserNameField() {
        page1.EnterCredentials("", "1010");
        Assert.assertEquals("Epic sadface: Username is required", page1.GetErrorMessageText());
    }

    @Test(priority = 5)
    public void CheckEmptyPasswordField() {
        page1.EnterCredentials("Nahed", "");
        Assert.assertEquals("Epic sadface: Password is required", page1.GetErrorMessageText());
    }

    @AfterTest
    public void Quit() {
        driver.quit();
    }
}
