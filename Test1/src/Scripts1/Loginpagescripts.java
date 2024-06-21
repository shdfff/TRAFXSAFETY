package Scripts1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpagescripts {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrikant.dodamani\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://results.stage.trafxsafe.com/en/users/sign_in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user_email")).sendKeys("shrikant.dodamani@transoftsolutions.com");
	   // WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    //Enter pwd     
	    driver.findElement(By.id("user_password")).sendKeys("Shreekupa@24");
	    // Click the sign in butto
	    driver.findElement(By.name("commit")).click();
	    driver.findElement(By.xpath("//span[contains(@class, 'side-section-labels')]")).click();
	    driver.findElement(By.id("region-site1146-container")).click();
	    Thread.sleep(3000);
	    js.executeScript("scroll(0, 250);");
	    driver.findElement(By.xpath("//a[@id='region-site1146-link-2']")).click();
	    Thread.sleep(2000);
	    js.executeScript("scroll(0, 350);");
	    WebElement firstStep=driver.findElement(By.linkText("Traffic Analysis"));
	    firstStep.click();
	    Thread.sleep(2000);
	    WebElement firstStep1=driver.findElement(By.linkText("Safety Analysis"));
	    firstStep1.click();
	    Thread.sleep(2000);
	    WebElement firstStep2=driver.findElement(By.linkText("Conflict Videos"));
	    firstStep2.click();
	    Thread.sleep(2000);
	 
	    WebElement firstStep3=driver.findElement(By.linkText("Violation Analysis"));
	    firstStep3.click();
	    Thread.sleep(2000);
	 
	    WebElement firstStep4=driver.findElement(By.linkText("Violation Videos"));
	    firstStep4.click();
	    Thread.sleep(2000);
	 
	    WebElement firstStep5=driver.findElement(By.linkText("Countermeasures"));
	    firstStep5.click();
	    Thread.sleep(15000);
	 
	    WebElement firstStep6=driver.findElement(By.linkText("Reports & Data"));
	    firstStep6.click();
	    Thread.sleep(2000);
	 
	    WebElement firstStep7=driver.findElement(By.linkText("Camera Coverage"));
	    firstStep7.click();
        Thread.sleep(2000);
	 

	 
	 
	    
	   // driver.findElement(By.xpath("//i[contains(@class, 'fas fa-car-crash')]")).click();
	    
	    
	   
       // WebElement bm1=driver.findElement(By.xpath("//a[@id='region-site908-link-2']"));
       // Select site=new Select(bm1);
	    
	    //driver.findElements(By.xpath("//a[contains(@class, 'definition')]"));
        
        
	    //driver.findElement(By.xpath("//a[contains(@role, 'button')]")).click();
	  //div[@id='region-map-container'] role="button"
	    //data-site-id="908"
	   // driver.findElement(By.xpath("//div[contains(@id, 'region-site908-container')]")).click();
	    
	   // driver.findElement(By.xpath("//a[contains(@id, 'region-site908-link-2')]")).click();
	    
	   
	}

}
