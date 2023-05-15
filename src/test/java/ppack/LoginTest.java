package ppack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
    WebDriver driver;

    @Test
    public void login() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        LoginPage lpage = new LoginPage(driver);

        lpage.emailField().sendKeys("Tester@test.com");
        lpage.passwordField().sendKeys("null123");
        lpage.loginButton().click();

        // @Test(priority = 2)
        // public void confirmAccountPage() throws InterruptedException {
        MyAccountPage mpage = new MyAccountPage(driver);
        Thread.sleep(4000);
        Assert.assertTrue(mpage.accountBreadcrumb().isDisplayed());
    }

    @AfterMethod
    public void Teardown() {
        driver.quit();
    }
}