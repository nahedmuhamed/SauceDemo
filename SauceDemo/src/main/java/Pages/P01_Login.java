package Pages;

import Utilities.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_Login {
    private WebDriver driver;

    public P01_Login(WebDriver driver) {
        this.driver = driver;
    }

    private final By UserName = By.id("user-name");
    private final By Password = By.id("password");
    private final By Login = By.id("login-button");
    private final By ErrorMessage = By.cssSelector(".error-message-container.error");

    public String GetUserNameId() {
        util.Visible(driver, UserName);
        return driver.findElement(UserName).getAttribute("id");
    }

    public String GetPasswordId() {
        util.Visible(driver, Password);
        return driver.findElement(Password).getAttribute("id");
    }

    public String GetLoginId() {
        util.Visible(driver, Login);
        return driver.findElement(Login).getAttribute("id");
    }

    public void EnterCredentials(String username, String pass) {
        util.sendData(driver, UserName, username);
        util.sendData(driver, Password, pass);
        util.clickingOnElement(driver, Login);
    }

    public String GetErrorMessageText() {
        return driver.findElement(ErrorMessage).getText();
    }

}

