package Scripts1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calibrationflow {

public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://calibrate.stage.trafxsafe.com/en/users/sign_in");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_email")).sendKeys("shrikant.dodamani@transoftsolutions.com");
	   // WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
	    
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   
	    driver.findElement(By.id("user_password")).sendKeys("Shreekupa@24");
	    
	    driver.findElement(By.name("commit")).click();
	    
	   driver.findElement(By.xpath("//i[contains(@class, 'fas fa-plus')]")).click();
	   driver.findElement(By.id("region-site1563-container")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("region-site1563-configure-link")).click();
	   Thread.sleep(7000);
	   
	   js.executeScript("scroll(0, 250);");
	   
	   WebElement okButton = new WebDriverWait(driver, 30).until(
	   ExpectedConditions.elementToBeClickable(By.id("edit_aerial")));
	   okButton.click();
	   
	   driver.findElement(By.id("done_btn")).click();
	   Thread.sleep(2000);
	   
	   js.executeScript("window.scrollBy(0, 500)");
	   Thread.sleep(3000);
	   
	   driver.findElement(By.id("nav-mvmt-ctrl-1")).click();
	   Thread.sleep(3000);
	   
	   WebElement addMovement1 = new WebDriverWait(driver, 30).until(
       ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@data-react-action-value, 'AddNewMovement')]")));
	   addMovement1.click();
	   
	   Thread.sleep(3000);
	   WebElement elementToHover = driver.findElement(By.id("path1303-64-4"));
       Actions actions = new Actions(driver);
       actions.moveToElement(elementToHover).perform();
       
       WebElement optionToClick = driver.findElement(By.id("path1303-64-4"));
       optionToClick.click();
       Thread.sleep(3000);
       
       js.executeScript("window.scrollBy(0, 250)");
       driver.findElement(By.id("add_tempMvmt_button")).click();
       Thread.sleep(4000);
       
      // driver.navigate().back()
      // driver.navigate().refresh();
       
      driver.findElement(By.xpath("//*[text()='Close']")).click();
       
       
     
       
       
	}

}
