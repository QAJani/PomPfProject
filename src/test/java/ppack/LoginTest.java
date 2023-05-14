package ppack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;

public class LoginTest {
    @Test
    public void login() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        LoginPage loginpage = new LoginPage();
        loginpage.emailField().sendKeys("Tester@test.com");
        loginpage.passwordField().sendKeys("null123");
        loginpage.loginButton().click();
    }
}
