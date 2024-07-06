package Scripts1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addaerialimage {

public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://calibrate.stage.trafxsafe.com/en/users/sign_in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_email")).sendKeys("shrikant.dodamani@transoftsolutions.com");
       
	   // WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	    //Enter pwd     
	    driver.findElement(By.id("user_password")).sendKeys("Shreekupa@24");
	  
	    // Click the sign in button
	    driver.findElement(By.name("commit")).click();
	    
	    
	   driver.findElement(By.xpath("//i[contains(@class, 'fas fa-plus')]")).click();
	    
	   driver.findElement(By.id("region-site1582-container")).click();
	   driver.findElement(By.id("region-site1582-configure-link")).click();
	   Thread.sleep(5000);
	   
	   js.executeScript("scroll(0, 250);");
	   WebElement okButton = new WebDriverWait(driver, 30).until(
	           ExpectedConditions.elementToBeClickable(By.id("edit_aerial")));
	   okButton.click();
	   
	  Thread.sleep(2000);
	   WebElement allSuggestions=driver.findElement(By.id("search-input"));
	   allSuggestions.sendKeys("124th street");
	   Thread.sleep(3000);
	   allSuggestions.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(3000);
	   allSuggestions.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	
	   driver.findElement(By.id("new")).click();
	   Thread.sleep(5000);
	   
	   WebElement allSuggestions1=driver.findElement(By.id("search-input"));
	   allSuggestions1.sendKeys("126th street");
	   Thread.sleep(3000);
	   allSuggestions1.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(3000);
	   allSuggestions1.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	
	   driver.findElement(By.id("new")).click();
	 Thread.sleep(5000); 
	 
	   js.executeScript("scroll(0, 250);");
	   driver.findElement(By.id("aerial_images_list-aerial_image-1120-name")).click();
	   
	   Thread.sleep(2000);
	   
	  driver.findElement(By.id("done_btn")).click();
	}

}
