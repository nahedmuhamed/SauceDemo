package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_Home {
    private WebDriver driver;
    private final By DivSwap = By.className("app_logo");

    public P02_Home(WebDriver driver) {
        this.driver = driver;
    }

    public String GetDivText() {
        return driver.findElement(DivSwap).getText();
    }
}
