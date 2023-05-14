package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    // objects created
    private By emailField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By loginButton = By.cssSelector("input[type='submit']");

    public WebElement emailField() {
        return driver.findElement(emailField);
    }

    public WebElement passwordField() {
        return driver.findElement(passwordField);
    }

    public WebElement loginButton() {
        return driver.findElement(loginButton);
    }
}
