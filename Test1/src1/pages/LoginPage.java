package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;

    public void openURL() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("email")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.name("login")).click();
    }

    public boolean verifyLogin() {
        try {
            return driver.findElement(By.id("logout")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}