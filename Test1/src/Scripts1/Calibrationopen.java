package Scripts1;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.Sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calibrationopen {

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
	   Thread.sleep(10000);
	   driver.findElement(By.id("region-site1616-container")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("region-site1616-configure-link")).click();
	   Thread.sleep(7000);
	   
	   js.executeScript("scroll(0, 250);");
	   
	   WebElement okButton = new WebDriverWait(driver, 30).until(
	   ExpectedConditions.elementToBeClickable(By.id("edit_aerial")));
	   okButton.click();
	   
	   driver.findElement(By.id("done_btn")).click();
	   Thread.sleep(2000);
	   
	   js.executeScript("window.scrollBy(0, 500)");
	   Thread.sleep(3000);
	   
	    driver.findElement(By.id("movement_list_16307_name")).click();
	    Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0, -250)");
	     WebElement canvas = driver.findElement(By.id("canvas_image"));
         canvas.click();
         Actions actions = new Actions(driver);
         actions.moveToElement(canvas, 100, 0).click().build().perform();
         actions.dragAndDropBy(canvas, 200, 0).click().build().perform();
         Thread.sleep(2000);
         actions.sendKeys(Keys.ENTER).perform();
         Thread.sleep(2000);
         
         driver.findElement(By.id("movement_list_16307_name")).click();
  	     Thread.sleep(2000);
  	     js.executeScript("window.scrollBy(0, -400)");
  	     WebElement canvas1 = driver.findElement(By.id("canvas_image")); 
         canvas1.click();
         actions.moveToElement(canvas1, 0, 100).click().build().perform();
         actions.dragAndDropBy(canvas1, 0, -100).click().build().perform();
         Thread.sleep(2000);
         actions.sendKeys(Keys.ENTER).perform();
         
         driver.findElement(By.id("alignments_submssion_btn_done")).click();
  	   Thread.sleep(2000);
	   
	   
	}

}
