package Scripts1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calibrationflow1 {

public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://calibrate.stage.trafxsafe.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    
	   driver.findElement(By.xpath("//i[contains(@class, 'fas fa-plus')]")).click();
	    
	   driver.findElement(By.id("region-site1551-container")).click();
	   driver.findElement(By.id("region-site1551-configure-link")).click();
	   Thread.sleep(5000);
	   
	   js.executeScript("scroll(0, 250);");
	   WebElement okButton = new WebDriverWait(driver, 30).until(
	           ExpectedConditions.elementToBeClickable(By.id("edit_aerial")));
	   okButton.click();
	   
		
		
	}

}
