package Scripts1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCamera {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		try {
            // Open the login page
            driver.get("https://calibrate.stage.trafxsafe.com/en/users/sign_in");
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		
    		driver.findElement(By.id("user_email")).sendKeys("shrikant.dodamani@transoftsolutions.com");
           
    	   // WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
    	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    	   
    	    driver.findElement(By.id("user_password")).sendKeys("Shreekupa@24");
    	  
    	   
    	    driver.findElement(By.name("commit")).click();

          
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.urlToBe("https://calibrate.stage.trafxsafe.com/"));

            
            Set<Cookie> cookies = driver.manage().getCookies();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cookies.data"))) {
                oos.writeObject(cookies);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            
        }
	}

}
